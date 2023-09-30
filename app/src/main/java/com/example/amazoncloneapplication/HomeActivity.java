package com.example.amazoncloneapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.example.amazoncloneapplication.MenuFiles.BaseActivity;
import com.example.amazoncloneapplication.MenuFiles.CartActivity;
import com.example.amazoncloneapplication.MenuFiles.SearchActivity;
import com.example.amazoncloneapplication.constant.Constant;
import com.example.amazoncloneapplication.model.Product;
import com.example.amazoncloneapplication.viewholder.ProductAdapter;
import com.example.amazoncloneapplication.viewholder.SliderAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class HomeActivity extends BaseActivity {

    Toolbar toolbar;
    SliderView sliderView;

    int[] images = {R.drawable.one, R.drawable.two,
            R.drawable.three, R.drawable.four};

    CardView shoes1, shoes2, shoes3, shoes4, shoes5;

    TextView oddshoename, oddshoeprice, evenshoename, evenshoeprice, viewAll;

    LinearLayout dynamicContent;
    LinearLayout bottomNavBar;

    public static ImageView home_cart;

    Intent intentcart;
    String getcartupdate;

    FirebaseStorage storage;
    StorageReference storageReference;

    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);

        dynamicContent = findViewById(R.id.dynamicContent);
        bottomNavBar = findViewById(R.id.bottomNavBar);
        View wizard = getLayoutInflater().inflate(R.layout.activity_home, null);
        dynamicContent.addView(wizard);

        RadioGroup rg = findViewById(R.id.radioGroup1);
        RadioButton rb = findViewById(R.id.bottom_home);

        rb.setBackgroundColor(R.color.Item_Selected);
        rb.setTextColor(Color.parseColor("#3F5185"));

        sliderView = findViewById(R.id.image_slider);
        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        toolbar = findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(R.drawable.bg_color);

        shoes1 = findViewById(R.id.shapes1);
        shoes2 = findViewById(R.id.shapes2);
        shoes3 = findViewById(R.id.shapes3);
        shoes4 = findViewById(R.id.shapes4);
        shoes5 = findViewById(R.id.shapes5);

        oddshoename = findViewById(R.id.oddshoname);
        oddshoeprice = findViewById(R.id.oddshoeprice);
        evenshoename = findViewById(R.id.evenshoename);
        evenshoeprice = findViewById(R.id.evenshoeprice);

        viewAll = findViewById(R.id.viewallProducts);
        home_cart= findViewById(R.id.home_cart);

        intentcart = getIntent();
        if(intentcart.getStringExtra("cartadd") !=null && intentcart.getStringExtra("cartadd").equals("yes")){
            home_cart.setImageResource(R.drawable.cartnotify);
        } else if (intentcart.getStringExtra("cartadd")!=null && intentcart.getStringExtra("cartadd").equals("no")) {
            home_cart.setImageResource(R.drawable.cart);
        }else {
            home_cart.setImageResource(R.drawable.cart);
        }

        storage = FirebaseStorage.getInstance();

        shoes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, ProductDetails.class);
                i.putExtra("name",oddshoename.getText().toString());
                i.putExtra("category", "Men's Running shoes");
                i.putExtra("price", oddshoeprice.getText().toString());
                i.putExtra("uniqueId",oddshoename.getText().toString());
                i.putExtra("id",1);
                startActivity(i);
            }
        });

        shoes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, ProductDetails.class);
                i.putExtra("name",evenshoename.getText().toString());
                i.putExtra("category", "Men's shoes");
                i.putExtra("price", evenshoeprice.getText().toString());
                i.putExtra("uniqueId",evenshoename.getText().toString());
                i.putExtra("id",2);
                startActivity(i);
            }
        });

        shoes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, ProductDetails.class);
                i.putExtra("name",oddshoename.getText().toString());
                i.putExtra("category", "Men's shoes");
                i.putExtra("price", oddshoeprice.getText().toString());
                i.putExtra("uniqueId",oddshoename.getText().toString());
                i.putExtra("id",1);
                startActivity(i);
            }
        });

        shoes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, ProductDetails.class);
                i.putExtra("name",evenshoename.getText().toString());
                i.putExtra("category", "Men's shoes");
                i.putExtra("price", evenshoeprice.getText().toString());
                i.putExtra("uniqueId",evenshoename.getText().toString());
                i.putExtra("id",2);
                startActivity(i);
            }
        });

        shoes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, ProductDetails.class);
                i.putExtra("name",oddshoename.getText().toString());
                i.putExtra("category", "Men's shoes");
                i.putExtra("price", oddshoeprice.getText().toString());
                i.putExtra("uniqueId",oddshoename.getText().toString());
                i.putExtra("id",1);
                startActivity(i);
            }
        });

        ListView lvProducts = findViewById(R.id.productslist);

        ProductAdapter productAdapter = new ProductAdapter(this);
        productAdapter.updateProducts(Constant.PRODUCT_LIST);

        lvProducts.setAdapter(productAdapter);

        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product product = Constant.PRODUCT_LIST.get(i);
                Intent intent= new Intent(HomeActivity.this, ProductDetails.class);
                intent.putExtra("id",3);
                intent.putExtra("uniqueId",product.getpName());
                intent.putExtra("name",product.getpName());
                intent.putExtra("description",product.getpDescription());
                intent.putExtra("category","smartphone");
                intent.putExtra("pprice",Constant.CURRENCY+ String.valueOf(product.getpPrice()
                        .setScale(0, BigDecimal.ROUND_HALF_UP)));
                intent.putExtra("imageName",product.getpImageName());
                startActivity(intent);
            }
        });

        home_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

//        addingToProdList();
    }

//    private void addingToProdList(){
//      String saveCurrentDate, saveCurrentTime;
//
//      Calendar calendar = Calendar.getInstance();
//      SimpleDateFormat currentDate = new SimpleDateFormat("MM dd, yyyy");
//      saveCurrentDate = currentDate.format(calendar.getTime());
//
//      SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm:ss a");
//      saveCurrentTime = currentTime.format(calendar.getTime());
//
//      DatabaseReference prodListRef = FirebaseDatabase.getInstance().getReference().child("View All");
//      String name = "Samsung Galaxy F42";
//
//      final HashMap<String, Object> prodMap = new HashMap<>();
//      prodMap.put("pid",name);
//      prodMap.put("name",name);
//      prodMap.put("price","₹17899");
//      prodMap.put("category","Smartphone");
//      prodMap.put("description","The Galaxy F42 5G that comes with the advanced 5G processor\nby Mediatek, the Dimensity 700, offers a breathtaking camera for sure. The specs include\na 64MP primary camera along with a 5-megapixel\nultra-wide shooter and a 2-megapixel depth sensor.");
//      prodMap.put("date",saveCurrentDate);
//      prodMap.put("time", saveCurrentTime);
//
//      prodListRef.child("User View").child("Products")
//              .child(name).updateChildren(prodMap)
//              .addOnCompleteListener(new OnCompleteListener<Void>() {
//                  @Override
//                  public void onComplete(@NonNull Task<Void> task) {
//                      Log.i("Task","successful");
//                  }
//              });
//    }
}