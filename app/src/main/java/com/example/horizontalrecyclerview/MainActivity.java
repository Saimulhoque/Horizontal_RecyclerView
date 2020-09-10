package com.example.horizontalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.horizontalrecyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Adapter recyclerviewadapter;
    ArrayList<RecyclerViewModel> recyclerViewModels;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.recyclerviewid);
        recyclerViewModels = new ArrayList<>();

        recyclerViewModels.add(new RecyclerViewModel(R.drawable.bike, "Bike"));
        recyclerViewModels.add(new RecyclerViewModel(R.drawable.car, "Car"));
        recyclerViewModels.add(new RecyclerViewModel(R.drawable.cng, "Cng"));
        recyclerViewModels.add(new RecyclerViewModel(R.drawable.truck, "Truck"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        RecyclerViewAdapter recyclerviewAdapter = new RecyclerViewAdapter(this,recyclerViewModels);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerviewAdapter);

    }
}