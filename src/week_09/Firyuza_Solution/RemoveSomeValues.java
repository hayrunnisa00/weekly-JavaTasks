package week_09.Firyuza_Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> valueList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 150, 200, 1000));

        Iterator<Integer> it = valueList.iterator();
        while(it.hasNext()){

            if(it.next()>100){//it.next get the value and at the same time compares to 100
                it.remove();
            }
        }
        //lambda method
        //valueList.removeIf(p-> p>100);

    }
}
/*
ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
 */