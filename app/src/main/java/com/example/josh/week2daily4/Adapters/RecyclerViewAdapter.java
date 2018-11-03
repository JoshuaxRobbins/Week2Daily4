package com.example.josh.week2daily4.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.josh.week2daily4.Models.Animal;
import com.example.josh.week2daily4.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private List<Animal> animalList;

    public RecyclerViewAdapter(List<Animal> animalList) {
        this.animalList = animalList;
    }



    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.row_item, null);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recylcerViewHolder, int position) {
        Animal animal = animalList.get(position);
        recylcerViewHolder.ivPicture.setImageBitmap(animal.getPicture());
        recylcerViewHolder.tvAnimalName.setText(animal.getName());
        recylcerViewHolder.tvAnimalAge.setText(animal.getAge());
        recylcerViewHolder.tvAnimalWeight.setText(animal.getWeight());
        recylcerViewHolder.tvAnimalFact.setText(animal.getFact());
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPicture;
        TextView tvAnimalName;
        TextView tvAnimalAge;
        TextView tvAnimalWeight;
        TextView tvAnimalFact;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPicture = itemView.findViewById(R.id.ivPicture);
            tvAnimalName = itemView.findViewById(R.id.tvAnimalName);
            tvAnimalAge = itemView.findViewById(R.id.tvAnimalAge);
            tvAnimalWeight = itemView.findViewById(R.id.tvAnimalWeight);
            tvAnimalFact = itemView.findViewById(R.id.tvAnimalFact);
        }
    }
}
