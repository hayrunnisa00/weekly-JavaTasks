package week_10.Santiago_Solutions;

import java.util.*;

public class mapSort_by_values {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("three", 3);
        map.put("seven", 7);
        map.put("two", 2);
        map.put("one", 1);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);

        sortMap(map);


    }

    //Using TreeSet , simple answer, to cast I use construct of the ArrayList to use the get()
    private static void sortMap(Map<String,Integer> map) {

        List<Map.Entry<String,Integer>> listMap = new ArrayList<>(map.entrySet());

        for (int i = 0; i < listMap.size(); i++) {

            for (int j = 0; j < listMap.size()-1; j++) {

                if (listMap.get(j).getValue() > listMap.get(j + 1).getValue()) {

                    Map.Entry<String, Integer> swap = listMap.get(j);
                    listMap.set(j, listMap.get(j + 1));
                    listMap.set(j + 1, swap);

                }

            }
        }

        Map<String, Integer> mapSorted = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : listMap) {

            mapSorted.put(each.getKey(), each.getValue());
        }

        System.out.println(mapSorted);
    }


    //Using 2 Loops to sort values in Ascending order

}
/*Map - Sort the map by values
Write a method that can sort the Map by values.*/