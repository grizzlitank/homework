package com.aplanatraining.homework2.exercise3;

import com.aplanatraining.homework2.exercise1.Calculator;
import com.aplanatraining.homework2.exercise2.ArrayCreator;

import java.util.Scanner;

public class Changer {


    public static void main(String[] args) {
        new Changer().run();
    }


    /**
     * @author Ilya Arkhipov
     * print message "Enter the operation(1 - calculator, 2 - arrayCreator):"
     */
    public static void printMessage(){
        System.out.println("Enter the operation(1 - calculator, 2 - arrayCreator):");
    }


    /**
     * @author Ilya Arkhipov
     * The method launch program
     */
    public void run(){
        Scanner scanner = new Scanner(System.in);
        printMessage();
        int operation = scanner.nextInt();
        if (operation == 1)new Calculator().scan();
        else if(operation == 2)new ArrayCreator().run();
        scanner.close();
    }




}
