package week_02.santiagoSolutions;

public class SwapNumbersWithout3rdVariable {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        System.out.println("Before swap "+ "n1= "+n1 +" "+"n2= "+n2);
        // Swap without third variable

        // We are using addition and subtraction
        n1=n1+n2;// n1 =10+20 = 30 n1
        n2=n1-n2;// n2 =30-20 = 10 n2
        n1=n1-n2;// n1 =30-10 = 20 n1


        System.out.println("After swap "+ "n1= "+n1 +" "+"n2= "+n2);

        //The key idea is to use the fact that adding and subtracting
        // the same value from a variable results in swapping values.

    }
}

/*Numbers -- Swap Numbers
*
* Swap two variable values without using a third variable*/