package week_10.Santiago_Solutions;

import java.util.*;

public class mapSort_by_values {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 3);
        map.put("Two", 7);
        map.put("Three", 2);
        map.put("Four", 1);
        map.put("Five", 4);
        map.put("Six", 5);
        map.put("Seven", 6);

        sortMap(map);


    }

    //Using TreeSet , simple answer, to cast I use construct of the ArrayList to use the get()
    private static void sortMap(Map<String,Integer> map) {

        Set<String> keys = map.keySet(); // {"One","Two","Three",....}
        Set<Integer> valuesSorted = new TreeSet<>(map.values());// {1,2,3,4,5,....}--> TreeSet will sorted by default

        for (int i = 0; i < map.size(); i++) {

            map.replace(new ArrayList<>(keys).get(i), new ArrayList<>(valuesSorted).get(i));
        }

        System.out.println(map);
    }


    //Using 2 Loops to sort values in Ascending order

}
/*Map - Sort the map by values
Write a method that can sort the Map by values.*/