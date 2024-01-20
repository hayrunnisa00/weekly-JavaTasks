package week_09.nisa_solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 45, 67, 789, 234, 10, 100, 23));

        System.out.println(removeGreaterThan100(numbers));

    }

    private static ArrayList<Integer> removeGreaterThan100(ArrayList<Integer> numbers) {

        numbers.removeIf(p -> p > 100);
        return numbers;

    }
}
