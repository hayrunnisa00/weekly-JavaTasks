package week_09.nisa_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_Ahmed {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println(removeName(names, "Ahmed"));

    }

    private static ArrayList<String> removeName(ArrayList<String> names, String name) {

        names.removeIf(p -> p.equals(name));

        return names;
    }


}
