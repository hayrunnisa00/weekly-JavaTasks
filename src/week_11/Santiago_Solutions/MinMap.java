package week_11.Santiago_Solutions;

import java.util.*;

public class MinMap {


    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("seven", 7);
        map.put("six", 6);
        map.put("eight", 8);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("ten", 10);

        System.out.println("min value from Map="+minIntegerMap(map));

        System.out.println("minIntegerMap2(map) = " + minIntegerMap2(map));


    }


    //Returning just the min value
    public static Integer minIntegerMap(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> setMap = map.entrySet(); // We create this to  iterate the map

        Integer  min = Integer.MAX_VALUE; // create this instance variable to store the minvalue

        for (Map.Entry<String, Integer> each : setMap) {

            if (each.getValue() < min) { // This loop is going to iterate the whole set and compare each value with the min

                min= each.getValue();// The conditions will give me the lowest values in the set
            }
        }
        return min; //we return the min value assigned

    }


    //Returning the pair key = value
    public static Map<String, Integer> minIntegerMap2(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> setMap = map.entrySet();

        Integer  min = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> each : setMap) {

            if (each.getValue() < min) {
                min= each.getValue();
            }
        }

        Map<String, Integer> result = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : setMap) {

            if (entry.getValue() == min) {

                result.put(entry.getKey(), entry.getValue());
            }

        }

        return result;

    }


    }

/*
Map - Min value
Write a method that can return the minimum value from a map (DO NOT
use sort method).
* */