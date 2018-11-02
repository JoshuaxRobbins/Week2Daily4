package com.example.josh.week2daily4.Animals;

public class Animal {

    String name;
    String age;
    String weight;
    String fact;

    public Animal(String name, String age, String weight, String fact) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.fact = fact;
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
