package week_10.nisa_solutions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMap {
    public static void main(String[] args) {

            Map<String, Integer> map = new LinkedHashMap<>(Map.of("b",5,"a",4,"n",6,"z",0,"p",3,"l",1,"e",2,"i",7));


            System.out.println("Before sorting "+map);
            System.out.println();
            System.out.println("After sorting "+mapSorted(map));


        }

        public static Map<String, Integer> mapSorted(Map<String, Integer> map) {

            List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
            // We are converting all the Map into an ArrayList

            for (int i = 0; i < entries.size(); i++) {    //Outer loop , it will get through all the elements

                for (int j = 0; j < entries.size()-1; j++) { //Inner loop , it will get through all the elements

                    if (entries.get(j).getValue() > entries.get(j + 1).getValue()) {// We are getting to the List , and then to the Map values

                        Map.Entry<String, Integer> temp = entries.get(j);// Here we swap the numbers, In j position store
                        entries.set(j, entries.get(j + 1)); // if the first
                        entries.set(j + 1, temp); // we set the new values

                    }

                }

            }
            Map<String, Integer> sorted = new LinkedHashMap<>();

            for (Map.Entry<String, Integer> each : entries) {
                sorted.put(each.getKey(), each.getValue());
            }

            return sorted;

        }


}

/*
 3. Map - Sort the map by values
Write a method that can sort the Map by value
 */