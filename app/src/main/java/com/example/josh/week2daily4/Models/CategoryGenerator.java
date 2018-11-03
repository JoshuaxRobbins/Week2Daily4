package com.example.josh.week2daily4.Models;

import java.util.ArrayList;
import java.util.List;

public class CategoryGenerator {
    static List<Category> categoryList = new ArrayList<>();

    public static List<Category> generate(){
        categoryList.add(new Category("Birds"));
        categoryList.add(new Category("Cats"));
        categoryList.add(new Category("Reptiles"));

        return categoryList;
    }

}

