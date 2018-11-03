package com.example.josh.week2daily4.Models;

import java.util.ArrayList;
import java.util.List;

public class AnimalGenerator {

    public static List<Animal> generate(String categoryId) {
        List<Animal> animalList = new ArrayList<>();

        switch (categoryId){

            case "Birds":
                animalList.add(new Animal("Penguin", "4", "5", "Can't fly", null, "Birds"));
                animalList.add(new Animal("Seagull", "2", "2", "Annoying", null, "Birds"));
                animalList.add(new Animal("Stork", "78", "3", "Delivers babies", null, "Birds"));
                break;

            case "Cats":
                animalList.add(new Animal("Lion", "7", "100", "Males have manes", null, "Cats"));
                animalList.add(new Animal("Tiger", "4", "90", "Has stripes", null, "Cats"));
                animalList.add(new Animal("Cheetah", "1", "70", "Runs HELLA fast", null, "Cats"));
                break;
            case "Reptiles":
                animalList.add(new Animal("Iguana", "4", "5", "Changes colors", null, "Reptiles"));
                animalList.add(new Animal("Gecko", "2", "3", "Does lizard stuff", null, "Reptiles"));
                animalList.add(new Animal("Anaconda", "3", "10", "Likes big buns", null, "Reptiles"));
                break;
        }

        return animalList;
    }
}
