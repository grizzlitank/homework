package com.aplanatraining.homework2.exercise5;

public class Jellybean extends Sweet {

    private String taste;
    public Jellybean(String name, int weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Jellybean{" +
                super.toStringWithoutSweet() +
                "taste='" + taste + '\'' +
                '}';
    }
}
