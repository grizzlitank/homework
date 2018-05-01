package com.aplanatraining.homework3;

import java.io.File;
import java.io.FileNotFoundException;


import java.util.*;

public class Main {

    public static Main main = new Main();

    public static void main(String[] args) {

        List<String> words = main.scan("D:\\file.txt");

        main.sortList(words);

        main.printList(words);

        main.getStatistics(words);


    }

    /**
     * @author Ilya Arkhipov
     * @param list of strings
     * Method sort strings of list
     */
    public void sortList(List<String> list){
        list.sort((o1, o2) -> o1.compareTo(o2));
    }

    /**
     * @author Ilya Arkhipov
     * @param list of strings
     * Method print strings of list
     */
    public void printList(List<String> list){
        System.out.println(list);
    }


    /**
     * @author Ilya Arkhipov
     * @param pathname of file
     * Method return list of strings from file
     */
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
        scanner.close();

        return words;
    }


    /**
     * @author Ilya Arkhipov
     * @param list of strings
     * Method print statistics of strings
     */
    public void getStatistics(List<String> list){

        main.getStatisticsFromMap(main.getMap(list));


    }


    /**
     * @author Ilya Arkhipov
     * @param list of strings
     * Method return map from list
     */
    public Map<String, Integer> getMap(List<String> list){
        Map<String, Integer> statistics = new HashMap<>();
        for(String a : list){
            if(statistics.containsKey(a)) {
                Integer b = statistics.get(a);
                statistics.remove(a);
                statistics.put(a, (b + 1));
            } else {
                statistics.put(a, 1);
            }
        }
        return statistics;
    }


    /**
     * @author Ilya Arkhipov
     * @param map where key - strings, value - countOfStrings
     * Method print statistics from map
     */
    public void getStatisticsFromMap(Map<String, Integer> statistics){
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


}
