package com.example.josh.week2daily4.Models;

import android.graphics.Bitmap;

public class Animal {

    String categoryId;
    String name;
    String age;
    String weight;
    String fact;
    Bitmap picture;


    public Animal(String name, String age, String weight, String fact,Bitmap picture,String categoryId) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.fact = fact;
        this.picture = picture;
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", fact='" + fact + '\'' +
                '}';
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}
