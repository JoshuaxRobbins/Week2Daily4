package com.example.josh.week2daily4.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.josh.week2daily4.Adapters.RecyclerViewAdapter;
import com.example.josh.week2daily4.Models.Animal;
import com.example.josh.week2daily4.Models.AnimalGenerator;
import com.example.josh.week2daily4.R;

import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    private List<Animal> animalList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.rvCategory);
        bindRecyclerView();


    }

    private void bindRecyclerView(){
        animalList = AnimalGenerator.generate(getIntent().getStringExtra("Category"));
        RecyclerView rvAnimalList = findViewById(R.id.rvCategory);
        adapter = new RecyclerViewAdapter(animalList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvAnimalList.setAdapter(adapter);
        rvAnimalList.setLayoutManager(layoutManager);
    }
}
