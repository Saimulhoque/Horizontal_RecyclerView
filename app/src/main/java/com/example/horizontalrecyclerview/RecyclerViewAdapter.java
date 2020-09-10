package com.example.horizontalrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private List<RecyclerViewModel> recyclerViewModels;

    public RecyclerViewAdapter(Context context, List<RecyclerViewModel> recyclerViewModels){
        this.context = context;
        this.recyclerViewModels = recyclerViewModels;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_vehicle,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    RecyclerViewModel recyclerViewModel = recyclerViewModels.get(position);
    holder.name.setText(recyclerViewModel.getVehiclename());
    holder.image.setImageResource(recyclerViewModel.getVehicleimage());
    }

    @Override
    public int getItemCount() {
        return recyclerViewModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.Vehiclename);
            image = itemView.findViewById(R.id.vehicleicon);
        }
    }

}
