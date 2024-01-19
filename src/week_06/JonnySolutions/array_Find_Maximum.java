package week_06.JonnySolutions;

public class array_Find_Maximum {
    public static void main(String args[])
    {
        int arr[] = {11, 44, 1, 55, 33, 22};
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}

//Write a method that can find the maximum number from an int Array