package week_08.Jonny_Solutions;

public class Array_N_Unique_Integers_that_sum_Up_To_0 {
    static void findNumbers(int N)
    {
        for (int i = 1; i <= N / 2; i++)
        {
            // Print 2 symmetric numbers
            System.out.print(i + ", " + -i + ", ");
        }

        // Print a extra 0 if N is odd
        if (N % 2 == 1)
            System.out.print(0);
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 5;
        findNumbers(N);
    }
}
/*Array - N unique integers that sum up to 0

 Write a function that given an integer N (1 < N < 100), returns an array
 containing N unique integers that sum up to 0. The function can return any
 such array.

 For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
 The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
 For N = 3 one of the possible answers is [-1,0,1] (but there are many more
 correct answers).*/