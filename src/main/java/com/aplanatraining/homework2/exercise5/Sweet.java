package com.aplanatraining.homework2.exercise5;

public class Sweet {

    private String name;
    private int weight;
    private int price;
    private int sugar;

    public Sweet() {
    }

    public Sweet(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Sweet(String name, int weight, int price, int sugar) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sugar=" + sugar +
                '}';
    }

    public String toStringWithoutSweet(){
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sugar=" + sugar;
    }
}
