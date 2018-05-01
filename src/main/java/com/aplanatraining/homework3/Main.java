package com.aplanatraining.homework3;

import java.io.File;
import java.io.FileNotFoundException;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        List<String> words = main.scan("D:\\file.txt");



        words.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(words);
        Map<String, Integer> statistics = new HashMap<>();
        for(String a : words){
            if(statistics.containsKey(a)) {
                Integer b = statistics.get(a);
                statistics.remove(a);
                statistics.put(a, (b + 1));
            } else {
                statistics.put(a, 1);
            }
        }

        String maxCountString = "";
        Integer count = 0;
        for (Map.Entry entry : statistics.entrySet()) {
            if((int)entry.getValue() > count) {
                count = (int)entry.getValue();
                maxCountString = (String)entry.getKey();
            }
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        System.out.printf("MaxCountString: %s  Count: %d", maxCountString, count);


    }

    public List<String> scan(String pathname){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(pathname));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            words.add(word);
        }

        return words;
    }
}
