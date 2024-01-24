package week_10.Jonny_Solutions;

public class ArrayList_sorting_in_descending_order {
    public static void main(String[] args) {

    int[] arr = new int[]{222, 555, 111, 333, 444};
        for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            int temp = 0;//temporary variable to store compared elements
            if (arr[i] < arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(arr[i]);
    }
}
}

/*write a method that can sort the arraylist in descending order without using the sort method*/