package com.aplanatraining.homework2.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SweetFactory {

    public static List<Sweet> sweetList = Arrays.asList(
      new Sweet("Сникерс", 50, 60, 30),
      new Candy("Коровка", 10, 10, 5),
      new Jellybean("Коричневый", 5, 5, "сопли")
    );

    public static void main(String[] args) {
        SweetFactory sweetFactory = new SweetFactory();
        sweetFactory.printWeight();
        sweetFactory.printPrice();
        sweetFactory.printSweetList();



    }

    public void printWeight(){
        System.out.println("Weight of sweetList:");
        int weight = 0;
        for(Sweet sweet : sweetList){
            weight+= sweet.getWeight();
        }
        System.out.println(weight);
    }

    public void printPrice(){
        System.out.println("Price of sweetList:");
        int price = 0;
        for(Sweet sweet : sweetList){
            price+= sweet.getPrice();
        }
        System.out.println(price);
    }

    public void printSweetList(){
        System.out.println(sweetList);
    }


}
