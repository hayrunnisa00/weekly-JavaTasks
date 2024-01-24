package week_09.Van_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValue {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(5,1,2,3,4,7,8,44,33,2,11,567,889,43,664));
        int num =100;
        System.out.println(removeValue(list,num));
        System.out.println(removeValue1(list,num));
    }
    public static List<Integer> removeValue(List<Integer> list, int num){
        List<Integer> newList=new ArrayList<>(list);
        Iterator<Integer> it = newList.iterator();
        while (it.hasNext()){
            Integer each = (Integer) it.next();
            if (each>num){
                it.remove();
            }
        }

        return newList;
    }
    public static List<Integer> removeValue1(List<Integer> list, int num){

            list.removeIf(k->k>num);

        return list;

    }


}
/*
ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
 */