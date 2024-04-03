package com.example.burgermenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<com.example.burgermenu.item> item;

    public Adapter(Context context, List<com.example.burgermenu.item> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(new View(context)).load(item.get(position).getImage()).into(holder.ItemIcon);
        com.example.burgermenu.item ramen = item.get(position);
        holder.ItemName.setText(ramen.getNameItem());
        holder.ItemDescription.setText(ramen.getDescriptionItem());
    }
    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ItemIcon;
        TextView ItemName, ItemDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemIcon = itemView.findViewById(R.id.ivItemIcons);
            ItemName = itemView.findViewById(R.id.tvNameItem);
            ItemDescription = itemView.findViewById(R.id.tvDescriptionItem);
        }
    }

}