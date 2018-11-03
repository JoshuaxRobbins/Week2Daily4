package com.example.josh.week2daily4.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.josh.week2daily4.Adapters.ListViewAdapter;
import com.example.josh.week2daily4.Models.Category;
import com.example.josh.week2daily4.Models.CategoryGenerator;
import com.example.josh.week2daily4.R;

import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    public static final String TAG = "_TAG";
    ListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

    }

    public void onSeeInCategory(View view) {
        TextView temp = view.findViewById(R.id.tvCategoryName);
        Log.d(TAG, "onSeeInCategory: " + temp.getText().toString());
        Intent intent = new Intent(getApplicationContext(), RecyclerViewActivity.class);
        intent.putExtra("Category",temp.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.clear();
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Category> categories = CategoryGenerator.generate();
        ListView lvCategories = findViewById(R.id.lvCategories);
        adapter = new ListViewAdapter(getApplicationContext(),R.layout.category_item,categories);
        lvCategories.setAdapter(adapter);
    }
}
