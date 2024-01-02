package week_08.nisa_solutions;

public class UniqueArray {
    public static void main(String[] args) {

        int[] arr = {1, 0, -3, 2};
        System.out.println("(arr) = " + uniqueArray(arr, 4));  // true

        int[] arr1 = {1, 0, -3, 2};
        System.out.println("(arr1) = " + uniqueArray(arr1, 5));  // false

        int[] arr2 = {1, -1,1,3};
        System.out.println("(arr2) = " + uniqueArray(arr2, 4));  // false

        int[] arr3 = {1, 0, -1};
        System.out.println("(arr3) = " + uniqueArray(arr3, 3)); // true

        System.out.println("(arr3) = " + uniqueArray(arr3, 4)); // false


    }

    private static boolean uniqueArray(int[] arr, int N) {

        boolean isUnique = false;
        int sum = 0;
        int frequency = 0;

        if (arr.length == N) {

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                for (int j = 0; j < arr.length; j++) {

                    if (arr[i] == arr[j]){
                        frequency ++;
                    }
                    if (frequency > 1){
                        isUnique = false;
                        break;
                    }
                }

                if (sum == 0){
                    isUnique = true;
                }

            }
        }
        return isUnique;

    }



}
