package week_07.santiago_solutions;

import java.util.*;

public class SortDescendingArray {


    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};

        descendingArr1(arr);

        System.out.println("sortedAscendingIntArray2(arr) = " + Arrays.toString(descendingArr2(arr)));


    }

    public static void descendingArr1(int[] arr) { // void method --> It will do an action and print the result

        TreeSet<Integer> treeSetArr = new TreeSet<>();  // Only disadvantage doesn't accept  duplicates

        for (int i = 0; i < arr.length; i++) {
            treeSetArr.add(Integer.valueOf(arr[i]));  // This will sort the  array in ascending order 1-->100...
        }

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = treeSetArr.size()-1,j=0; i >= 0; i--,j++) { //"i" with forr logic,  and "j" with fori logic

            linkedList.add(new ArrayList<Integer>(treeSetArr).get(i)); // We use the arraylist constructor to use get Method
                                                                        // We CAN'T DO CASTING coz don't have a relationship,
                                                                        // ALl this to assign each value to LinkedList that has FIFO
            arr[j] = linkedList.pop(); //FIFO (First-In- First-Out)
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] descendingArr2(int[] arr) { // Return Method

        TreeSet<Integer> treeSetArr = new TreeSet<>();  // Only disadvantage doesn't accept  duplicates

        for (int i = 0; i < arr.length; i++) {
            treeSetArr.add(Integer.valueOf(arr[i]));  // This will sort the array in ascending order 1-->100...
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = treeSetArr.pollLast();    // I'm going to use the Last value is the First value entering the arr 100--->1
        }

        return arr;
    }

}

//Question3: Array - Sort Descending
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex: int[] arr = {10,20,7, 8, 90};
//arr = Sort(arr); ==> {90, 20, 10, 8, 7};