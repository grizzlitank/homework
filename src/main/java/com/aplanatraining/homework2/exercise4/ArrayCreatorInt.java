package com.aplanatraining.homework2.exercise4;

public class ArrayCreatorInt {
    private static int [] array = new int[20];

    public static void main(String[] args) {
        ArrayCreatorInt arrayCreatorInt = new ArrayCreatorInt();
        arrayCreatorInt.fillArray();
        for(int a : array){
            System.out.println(a);
        }
        System.out.println();
        int maxMinus = arrayCreatorInt.getIndexMaxMinus();
        int maxPlus = arrayCreatorInt.getIndexMinPlus();
        int g = array[maxMinus];
        array[maxMinus] = array[maxPlus];
        array[maxPlus] = g;
        System.out.println();
        for(int a : array){
            System.out.println(a);
        }


    }


    /**
     * @author Ilya Arkhipov
     * random initialising of array in diapason [-10, 10]
     */
    public void fillArray(){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*20) - 10;
        }
    }


    /**
     * @author Ilya Arkhipov
     * @return index of max minus number
     */
    public int getIndexMaxMinus(){
        int maxMinus = -10;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0 && array[i] > maxMinus){
                maxMinus = array[i];
                index = i;
            }

        }
        System.out.println(maxMinus);
        return index;
    }

    /**
     * @author Ilya Arkhipov
     * @return index of min plus number
     */
    public int getIndexMinPlus(){
        int minPlus = 10;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0 && array[i] < minPlus){
                minPlus = array[i];
                index = i;
            }

        }
        System.out.println(minPlus);
        return index;
    }

}
