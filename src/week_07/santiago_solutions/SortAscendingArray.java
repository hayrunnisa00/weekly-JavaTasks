package week_07.santiago_solutions;

import java.util.Arrays;
import java.util.TreeSet;

//Question2: Array - Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex: int[] arr = {10, 9, 8, 7};
//arr = Sort(arr); ==>{ 7, 8, 9, 10};
public class SortAscendingArray {


    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        ascendingArr1(arr);

        System.out.println("=================================================");

                                                //DON'T FORGET  Arrays.toString()--> to print array
        System.out.println("ascendingArr2(arr) = " + Arrays.toString(ascendingArr2(arr)));


    }


    public static void ascendingArr1(int[] arr) { // We make it void because we're doing an action instead of returning something


        TreeSet<Integer> treeSetArr = new TreeSet<>(); // The only problem here is that doesn't accept duplicates elements

        for (int i = 0; i < arr.length; i++) {
            treeSetArr.add(Integer.valueOf(arr[i]));
        }


        System.out.println(treeSetArr);
    }

    public static int[] ascendingArr2(int[] arr) {

        TreeSet<Integer> treeSetArr = new TreeSet<>(); // The only problem here is that doesn't accept duplicates elements

        for (int i = 0; i < arr.length; i++) {

            treeSetArr.add(Integer.valueOf(arr[i]));

        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = treeSetArr.pollFirst();

        }

        return arr;
    }


}
//Question2: Array - Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex: int[] arr = {10, 9, 8, 7};
//arr = Sort(arr); ==>{ 7, 8, 9, 10};