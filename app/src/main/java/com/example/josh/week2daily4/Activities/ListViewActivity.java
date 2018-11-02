package com.example.josh.week2daily4.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.josh.week2daily4.Adapters.ListViewAdapter;
import com.example.josh.week2daily4.Animals.CategoryGenerator;
import com.example.josh.week2daily4.R;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView lvCategories = findViewById(R.id.lvCategories);
        ListViewAdapter adapter = new ListViewAdapter(getApplicationContext(),R.layout.category_item,CategoryGenerator.generate());
        lvCategories.setAdapter(adapter);

    }

    public void onSeeInCategory(View view) {

    }

}
