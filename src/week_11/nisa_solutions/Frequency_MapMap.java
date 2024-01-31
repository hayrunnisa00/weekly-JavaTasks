package week_11.nisa_solutions;

import java.util.*;

public class Frequency_MapMap {
    public static void main(String[] args) {

        Map<Integer, String> mapList = new LinkedHashMap<>();
        mapList.put(1, "apple");
        mapList.put(2, "orange");
        mapList.put(3, "banana");
        mapList.put(4, "kiwi");
        mapList.put(5, "mango");
        mapList.put(6, "grape");

        System.out.println(mapList);

        System.out.println(frequencyMap(mapList));

    }


    public static Map<Integer, String> frequencyMap(Map<Integer, String> mapList) {

        Map<Integer, String > frequencyMap = new LinkedHashMap<>();
        String freq = "";

        for (Map.Entry<Integer, String> eachValue : mapList.entrySet()) {

            for (int i = 0; i < eachValue.getValue().length(); i++) {
                int count = 0;
                if (freq.contains(eachValue.getValue().charAt(i) + "")){
                    continue;
                }else {
                    for (int j = 0; j < eachValue.getValue().length(); j++) {
                        if (eachValue.getValue().charAt(i) == eachValue.getValue().charAt(j)) {
                            count++;

                        }

                    }
                    freq += "" + eachValue.getValue().charAt(i) + count;
                }
            }

            frequencyMap.put(eachValue.getKey(), freq);

        }

        return frequencyMap;

    }


}