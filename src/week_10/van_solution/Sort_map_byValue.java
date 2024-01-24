package week_10.van_solution;

import java.util.*;
import java.util.stream.Collectors;

public class Sort_map_byValue {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Lana",1);
        map.put("David",6);
        map.put("Obama",4);
        map.put("Ana",1);
        map.put("Phoebe",3);
        map.put("Becky",5);
        map.put("Maria",4);

        System.out.println("---------------------Before-------------------");
        System.out.println(map);
        System.out.println("---------------------Before-------------------");
        System.out.println(sort_Map(map));


    }
    public static Map<String,Integer> sort_Map (Map<String,Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getValue() > list.get(j + 1).getValue()) {

                    // SWAP Map
                    Map.Entry<String, Integer> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }

            }

        }
        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list) {
            sorted.put(each.getKey(), each.getValue());

        }


        return sorted;


    }
    }

