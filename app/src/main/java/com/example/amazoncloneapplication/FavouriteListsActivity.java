package com.example.amazoncloneapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazoncloneapplication.MenuFiles.ProfileActivity;
import com.example.amazoncloneapplication.model.FavoriteItem;
import com.example.amazoncloneapplication.model.Orders;
import com.example.amazoncloneapplication.viewholder.FavoriteItemViewHolder;
import com.example.amazoncloneapplication.viewholder.OrdersViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.squareup.picasso.Picasso;

public class FavouriteListsActivity extends AppCompatActivity {

    FirebaseAuth auth;
    ImageView backProfile;
    RecyclerView favouritelist;

    Toolbar favouritelistToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_lists);

        backProfile = findViewById(R.id.backProfile);
        favouritelist = findViewById(R.id.favourite_listrecycle);
        favouritelist.setLayoutManager(new LinearLayoutManager(FavouriteListsActivity.this));

        auth = FirebaseAuth.getInstance();

        favouritelistToolbar = findViewById(R.id.favouritelist_toolbar);
        favouritelistToolbar.setBackgroundResource(R.drawable.bg_color);

        backProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FavouriteListsActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onStart(){
        super.onStart();
        final DatabaseReference favouriteRef = FirebaseDatabase.getInstance().getReference();

        FirebaseRecyclerOptions<FavoriteItem> options = new FirebaseRecyclerOptions.Builder<FavoriteItem>()
                .setQuery(favouriteRef.child("Favourite").child(auth.getCurrentUser().getUid())
                        .child("FavouriteItems"),FavoriteItem.class).build();

        FirebaseRecyclerAdapter<FavoriteItem, FavoriteItemViewHolder> adapter =
                new FirebaseRecyclerAdapter<FavoriteItem, FavoriteItemViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull FavoriteItemViewHolder holder, int position, @NonNull FavoriteItem model) {
                        holder.productName.setText(model.getName());
                        holder.productPrice.setText(model.getTotalAmount());
                    }

                    @NonNull
                    @Override
                    public FavoriteItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favourite_list_cardview, parent, false);
                        FavoriteItemViewHolder holder = new FavoriteItemViewHolder(view);
                        return holder;
                    }
                };

        favouritelist.setAdapter(adapter);
        adapter.startListening();
    }
}