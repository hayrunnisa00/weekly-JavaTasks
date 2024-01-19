package week_09.Firyuza_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        // Remove all the "Ahmed" names using iterator
        Iterator<String> iterator = namesList.iterator();
        while (iterator.hasNext()) {//read all the elements
            String name = iterator.next();//if the value exists, it returns the value that you're looking for
            if (name.equals("Ahmed")) {
                iterator.remove();//it will remove the element that you're looking for
            }
        }
        //method below is lambda expression, is same as method above but in one line
      // namesList.removeIf(p-> p.equals("Ahmed"));

        System.out.println(namesList);
    }
}
/*
2) ArrayList - Remove "Ahmed"
Given a list of people's names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 *



 */