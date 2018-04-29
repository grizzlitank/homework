package com.aplanatraining.homework2.exercise2;

import java.util.Scanner;

public class ArrayCreator {




    public static void main(String[] args) {
        new ArrayCreator().run();

    }

    public void run(){
        String[] array = this.scan();
        System.out.println(this.getMaxLengthString(array));
    }

    public String[] scan(){
        Scanner scanner = new Scanner(System.in);
        printMessageOne();
        String[] array = createArray(scanner.nextInt());
        printMessageTwo();
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.next();
        }
        scanner.close();
        return array;
    }

    public String getMaxLengthString(String[] array){
        int maxLength = 0;
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i].length() > maxLength){
                maxLength = array[i].length();
                index = i;
            }
        }
        return array[index];
    }

    public void printMessageOne(){
        System.out.println("Enter the length of array");
    }

    public void printMessageTwo(){
        System.out.println("Enter the words");
    }

    public String[] createArray(int length){
        return new String[length];
    }
}
