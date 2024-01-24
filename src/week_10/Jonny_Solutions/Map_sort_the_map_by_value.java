package week_10.Jonny_Solutions;

import java.util.*;

public class Map_sort_the_map_by_value {
    public static void main(String[] args) {

        HashMap<String,Integer>salary=new HashMap<>();
        salary.put("John",80000);
        salary.put("Jane",120000);
        salary.put("Jake",95000);
        salary.put("Jen",100000);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(salary.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer>s1, Map.Entry<String,Integer> s2){
                return s1.getValue()-s2.getValue();
            }
        });
        for (Map.Entry<String,Integer>s:list){
            System.out.println(s.getKey()+"="+s.getValue());
        }
    }
}
/* write a method that can sort the map by values */