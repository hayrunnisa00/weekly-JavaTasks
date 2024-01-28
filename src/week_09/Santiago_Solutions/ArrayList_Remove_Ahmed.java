package week_09.Santiago_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Remove_Ahmed {

    public static void main(String[] args) {

        List<String> listNames = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        String nameToRemove = "Ahmed";

        removeName1(listNames, nameToRemove);

        System.out.println("=====================================");

        removeName2(listNames,nameToRemove);

        System.out.println("====================");

        removeName3(listNames, nameToRemove);
    }


    //Without Remove Method from ArrayList class
    public static void removeName1(List<String> listOfNames , String nameToRemove) {

        List<String> newList = new ArrayList<>();
        for (String eachName : listOfNames) {
            if (!eachName.equalsIgnoreCase(nameToRemove)) {
                newList.add(eachName);
            }
        }
        System.out.println(newList);
    }

    // remove predicate
    public static void removeName2(List<String> listOfNames , String nameToRemove) {

        listOfNames.removeIf(k -> k.equals(nameToRemove));

        System.out.println(listOfNames);
    }

    //remove method from collections classes
    public static void removeName3(List<String> listOfNames , String nameToRemove) {

        for (String each : listOfNames) {
            listOfNames.remove(each.equalsIgnoreCase(nameToRemove));
        }

        System.out.println(listOfNames);

    }

}

/*2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed*/
