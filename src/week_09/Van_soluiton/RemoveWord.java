package week_09.Van_soluiton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveWord {
    public static void main(String[] args) {
List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
String name="Ahmed";
        System.out.println(list);
        System.out.println(removeName(list,name));
        System.out.println(removeName1(list,name));
    }
    public static List<String> removeName(List<String> names, String name){
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String currentName = iterator.next();
            if (currentName.equals(name)){
                iterator.remove();
            }
        }
        return names;
    }
    public static List<String> removeName1(List<String> names, String name){
        names.removeIf(k->k.equals("Ahmed"));

        return names;
    }

}
