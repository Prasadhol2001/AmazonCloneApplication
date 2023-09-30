package com.example.amazoncloneapplication.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.amazoncloneapplication.Interfaces.ItemClickListener;
import com.example.amazoncloneapplication.R;
import com.example.amazoncloneapplication.model.FavoriteItem;

public class FavoriteItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView productName, productPrice;
    private ItemClickListener itemClickListener;

    public FavoriteItemViewHolder(@NonNull View itemView) {
        super(itemView);

        productName = itemView.findViewById(R.id.productlist_Name); // Replace with your text view's ID
        productPrice = itemView.findViewById(R.id.productlist_Price); // Replace with your text view's ID
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(), false);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
