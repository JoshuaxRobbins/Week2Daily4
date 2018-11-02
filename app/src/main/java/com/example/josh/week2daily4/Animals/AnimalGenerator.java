package com.example.josh.week2daily4.Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalGenerator {

    public static List<Animal> generate(int count, boolean random) {
        List<Animal> animalList = new ArrayList<>();

        if (random) {
            for (int i = 0; i < count; i++) {
                animalList.add(new Animal(getNameRandom(), getAgeRandom(), getWeightRandom(), getFactRandom()));
            }


            return animalList;
        }
        else {

            animalList.add(new Animal("Penguin", "4", "5", "Can't fly"));
            animalList.add(new Animal("Seagull", "2", "2", "Annoying"));
            animalList.add(new Animal("Stork", "78", "3", "Delivers babies"));
            animalList.add(new Animal("Lion", "7", "100", "Males have manes"));
            animalList.add(new Animal("Tiger", "4", "90", "Has stripes"));
            animalList.add(new Animal("Cheetah", "1", "70", "Runs HELLA fast"));
            animalList.add(new Animal("Iguana", "4", "5", "Changes colors"));
            animalList.add(new Animal("Gecko", "2", "3", "Does lizard stuff"));
            animalList.add(new Animal("Anaconda", "3", "10", "Likes big buns"));

            return animalList;
        }
    }

    public static String getNameRandom() {
        List<String> names = new ArrayList<>();
        names.add("Snake");
        names.add("Wolf");
        names.add("Bird");
        names.add("Cat");
        names.add("Dog");
        names.add("Rabbit");
        names.add("Mouse");
        names.add("Lizard");
        names.add("Tiger");

        return names.get(new Random().nextInt(names.size()));
    }

    public static String getAgeRandom() {
        return String.valueOf((new Random().nextInt(20) + 1));
    }

    public static String getWeightRandom() {
        return String.valueOf((new Random().nextInt(40) + 1));
    }

    public static String getFactRandom() {
        return "Fun Fact";
    }
}
