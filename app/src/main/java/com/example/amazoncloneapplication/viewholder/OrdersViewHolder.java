package com.example.amazoncloneapplication.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazoncloneapplication.Interfaces.ItemClickListener;
import com.example.amazoncloneapplication.R;

public class OrdersViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView orderName, orderDate, orderAddr, orderCiy, orderPrice, orderPhone;
    private ItemClickListener itemClickListener;

    public OrdersViewHolder(@NonNull View itemView) {
        super(itemView);

        orderName= itemView.findViewById(R.id.orderName);
        orderPhone= itemView.findViewById(R.id.orderPhone);
        orderAddr = itemView.findViewById(R.id.orderAddress);
        orderCiy = itemView.findViewById(R.id.orderCity);
        orderPrice = itemView.findViewById(R.id.orderPrice);
        orderDate = itemView.findViewById(R.id.orderDate);
   }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(),false);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
}
