package week_11.nisa_solutions;

import java.util.*;

public class Frequency_StringMap {

    public static void main(String[] args) {

        String str = "aaadddggggggbbhhjkuuu";

        System.out.println(str);
        System.out.println(frequencyStr(str));


    }

    private static Map<String, Integer> frequencyStr(String str) {

        Map<String, Integer> mapList = new LinkedHashMap<>();

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (int i = 0; i < list.size(); i++) {
            int num = Collections.frequency(list, list.get(i));

            mapList.put(list.get(i), num);

        }


        return mapList;
    }

}
