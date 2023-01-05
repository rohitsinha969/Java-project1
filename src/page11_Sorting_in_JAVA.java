import java.lang.reflect.Array;
import java.util.*;

/**
 * page11_Sorting_in_JAVA
 */
public class page11_Sorting_in_JAVA {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 67,32,27,22,94,17,66,57,60,52,73,49 };

        /*
         * // BUBBLE SORT
         * // Time Complexity = 0(n*n)
         * // in ascending
         * for (int i = 0; i < arr.length; i++) { // n-1
         * for (int j = 0; j < arr.length - 1 - i; j++) { // n*n
         * if (arr[j] > arr[j + 1]) {
         * // swapping the elements of j++ to j if condition is true
         * int temp = arr[j];
         * arr[j] = arr[j + 1];
         * arr[j + 1] = temp;
         * }
         * }
         * }
         */
        // // in descending order
        // incomplete h ye
        // for (int i = arr.length; i > 0; i--) { // n-1
        // for (int j = arr.length - 1 - i; j > 0; j--) { // n*n
        // if (arr[j - 1] > arr[j]) {
        // // swapping the elements of j++ to j if condition is true
        // int temp = arr[j - 1];
        // arr[j - 1] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }

        /*
         * // SELECTION SORT
         * // Time Complexity = 0(n*n) ---> (n-1)+(n-2)+(n-3)....+(0)=[n(n+1)/2] sum of
         * an
         * // arithmetic progression with common difference 1
         * // in ascending
         * for (int i = 0; i < arr.length; i++) {
         * int smallest = i;
         * for (int j = i + 1; j < arr.length; j++) {
         * if (arr[smallest] > arr[j]) {
         * smallest = j;
         * }
         * }
         * int temp = arr[smallest];
         * arr[smallest] = arr[i];
         * arr[i] = temp;
         * }
         * 
         */

        // INSERTION SORT
        // Time Complexity = 0(n*n)
        // in ascending
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1; // using j as a sorted part and we will wait to make it 0
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placing element at right place in sorted part of array
            arr[j + 1] = current;
        }
        int [] a = {5,6};
        int [] aa = {5,5};
        System.out.println(!Arrays.equals(a, aa));

        int m = 3;
        int n =3;
        int[][] mat = new int[m][n] ;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 0) System.out.println("0");
                if(mat[i][j] == 1) System.out.println(i+j);

                mat[i][j] = mat[i-1][j] + mat[i][j-1];
            }
        }

        /*
        // Question :- find median in any array of non-specific length
        if (arr.length % 2 == 0){
            //int avg = ((arr.length/2) + ((arr.length/2)-1)/2);// non sense of using avg
            int median_Index_based = Math.floorDiv(arr.length, 2);
            int median = arr[median_Index_based] + arr[median_Index_based-1];
            System.out.println(Math.floorDiv(median,2));
        }
        else {
            int median = Math.floorDiv(arr.length, 2);
            System.out.println(arr[median]);
        }
        */
        printArray(arr);
        

    }
}