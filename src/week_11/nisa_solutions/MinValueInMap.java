package week_11.nisa_solutions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinValueInMap {
    public static void main(String[] args) {

        Map<String, Integer> mapList = new LinkedHashMap<>();
        mapList.put("a", 8);
        mapList.put("g", 6);
        mapList.put("h", 9);
        mapList.put("e", 11);
        mapList.put("i", 34);
        mapList.put("l", 45);
        mapList.put("r", 12);

        System.out.println(minValue(mapList));

    }


    public static int minValue(Map<String, Integer> mapList) {

        int minNum = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> eachValue : mapList.entrySet()) {
            list.add(eachValue.getValue());
        }


            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < minNum) {
                    minNum = list.get(i);
                }

            }


        return minNum;

    }


}
