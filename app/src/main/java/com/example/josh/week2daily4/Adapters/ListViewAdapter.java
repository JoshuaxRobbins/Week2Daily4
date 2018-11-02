package com.example.josh.week2daily4.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.josh.week2daily4.Animals.Animal;
import com.example.josh.week2daily4.Animals.Category;
import com.example.josh.week2daily4.R;

import java.util.List;
import java.util.Objects;

public class ListViewAdapter extends ArrayAdapter<Category> {
    public ListViewAdapter(@NonNull Context context, int resource, @NonNull List<Category> categoryList) {
        super(context, resource, categoryList);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);
        TextView tvCategoryName = convertView.findViewById(R.id.tvCategoryName);
        Category category = getItem(position);
        tvCategoryName.setText(category.getCategoryTitle());

        return convertView;
    }
}
