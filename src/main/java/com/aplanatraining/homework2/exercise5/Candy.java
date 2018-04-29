package com.aplanatraining.homework2.exercise5;

public class Candy extends Sweet {


    private int hardness;

    public Candy(String name, int weight, int price, int hardness) {
        super(name, weight, price);
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Candy{" +
                super.toStringWithoutSweet() +
                "hardness=" + hardness +
                "} ";
    }
}
