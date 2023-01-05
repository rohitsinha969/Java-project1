
//import java.lang.reflect.Array;
//import java.util.Arrays;
import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

//import javax.lang.model.element.Element;

//import org.w3c.dom.UserDataHandler;

public class page8_arrays_in_JAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * ARRAYS
         * Array is a collection of similar type of data - ek hi bacha ka marks in
         * diffrent subjects
         * ab har subject ke liye variable banana is quite non-professional especially
         * jab baat 1000+ students ka ho to , so arrays use karte h.
         * Syntax of array:-
         * int [] variable name = new int [5]; -> data type [] array_name
         * upar syntax me memory allocation same line me kiya gya h otherwise sirf (int
         * [] variable name;) se bhi kaam ho sakta h
         * variable name yahan par refrence ka kaam karega ki kis kaam ke liye ye array
         * banaya gya h
         * new int is the object here
         * 
         * Qs- Why arrays are recommended for programming in java for more number of
         * refrence variables ?
         * Ans- because accessing elements/retreival of elements in arrays is very quick
         * and easy. (arrays also starts from 0 to n-1)
         * Arrays are overwritable if code is written multiple times
         */

        // example of array amd 3 ways to create arrays in java
        // int[] marks = new int[5]; // 1-decalration + memory allocation
        // int[] marks; // 2-declaration of Array
        // marks = new int[5]; // memory allocation of Array
        // int [] marks = {100,98,96,84,87}; // 3-declaration + initialization (memory
        // java khud allocate kar dega)
        // marks[0] = 100;
        // marks[1] = 98;
        // marks[2] = 96;
        // marks[3] = 84;
        // marks[4] = 87;
        // marks[4] = 89; // arrays are overwritable
        // System.out.println(marks[3]);
        // System.out.println(marks.length); // gives array length
        // // Array can be Float or String also
        // String [] names = {"Name0","Name1","Name2","Name3","Name4"};
        // System.out.println(names [4]);

        // An array can be displayed in a Naive way (easy but non-productive - bahut
        // code likhna padega)
        // marks[0] = 100;
        // marks[1] = 98;
        // marks[2] = 96;
        // marks[3] = 84;
        // marks[4] = 87;
        // marks[4] = 89;
        // But its better to use a loop to display an Array :-
        // Display of Array using FOR LOOP [Array Traversal]
        // int [] marks = {100,98,96,84,87}; // in serial order
        // int a= marks.length;
        // for (int i=0; i<a; i++){
        // System.out.println(marks[i]);
        // }
        // int [] marks = {100,98,96,84,87}; // in reverse order
        // int a= marks.length;
        // for (int i=a-1; i>=0; i--){
        // System.out.println(marks[i]);
        // }

        // For-Each loop in Arrays
        // int [] marks = {100,98,96,84,87};
        // for (int elements : marks){
        // System.out.println(elements);
        // }
        // For-Each loop is also used for displaying Arrays in JAVA (little complicated
        // but direct method)
        // For-Each loop me index number or array length se koi matlab ni rehta h

        // MULTI-DIMENSIONAL ARRAY
        // agar har memory allocation me arrays hi store kare to use multi-dimensional
        // array bolte h
        // ARRAYS of ARRAYS is called MULTI-DIMENSIONAL ARRAY (3D/4D/5D..... ARRAY)
        // Elements of an array is also an array

        // 2D Array:-
        // making an array for floors and room numbers in an apartment
        // int [][] room_numbers= new int [2][3]; // har floor pe 3 rooms h
        // room_numbers [0][0] = 101 ; // ground floor ka 1st room
        // room_numbers [0][1] = 102 ; // ground floor ka 2nd room
        // room_numbers [0][2] = 103 ; // ground floor ka 3rd room
        // room_numbers [1][0] = 201 ; // first floor ka 1st room
        // room_numbers [1][1] = 202 ; // first floor ka 2nd room
        // room_numbers [1][2] = 203 ; // first floor ka 3rd room
        // //System.out.println(room_numbers[0][2]);
        // //System.out.println(room_numbers[1][2]);
        // for (int i=0; i<room_numbers.length; i++){
        // for (int j=0; j<room_numbers[0].length; j++){
        // System.out.print(room_numbers[i][j]);
        // System.out.print(" ");
        // }
        // System.out.print("\n");
        // }

        // __________________________________________________________________________________________________________________________________________________________________

        // Practice problems on arrays

        // Sum of elements if an array
        // Float [] numbers = {45.7f, 85.2f, 15.24f, 14.45f, 45.99f};
        // //Float sum= numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        // Float sum= 0f;
        // for(float elements:numbers){
        // sum= sum+ elements;
        // }
        // System.out.println(sum);// saara elements ko baar baar likhna ni hoga

        // Sum of elements if an array
        // Float[] numbers = { 45.7f, 85.2f, 15.24f, 14.45f, 45.99f };
        // // Float sum= numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        // Float sum = 0f;
        // for (float elements : numbers) {
        // sum = sum + elements;
        // }
        // System.out.println(sum);// saara elements ko baar baar likhna ni hoga

        // Average of Numbers in array
        // Float[] numbers = { 45.7f, 85.2f, 15.24f, 14.45f, 45.99f };
        // // Float sum= numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        // Float sum = 0f;
        // for (float elements : numbers) {
        // sum = sum + elements;
        // }
        // System.out.println("average is :- " + sum/numbers.length);

        // Find whether an element is in the array or not
        // Float[] numbers = { 45.7f, 85.2f, 15.24f, 14.45f, 45.99f };
        // // Float sum= numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        // System.out.println("Give me your value so i will check it !");
        // Float num = sc.nextFloat();
        // boolean InArray= false;
        // for (float elements : numbers){
        // if (num==elements) {
        // InArray= true;
        // break;
        // }
        // }
        // if (InArray==true) {
        // System.out.println("yes value is in the array");
        // } else {
        // System.out.println("no value isnt in the array");
        // }

        // making matrices using arrays
        /*
         * int[][] matrix1 = { { 1, 2, 3 },
         * { 4, 5, 6 } };
         * int[][] matrix2 = { { 11, 22, 33 },
         * { 44, 55, 66 } };
         * int[][] result = { { 0, 0, 0 },
         * { 0, 0, 0 } };
         * for (int i=0; i<matrix1.length; i++) {
         * for (int j=0; j<matrix1[i].length; j++){
         * //System.out.format("setting values of i=%d j=%d\n ",i,j);
         * result [i][j] = matrix1[i][j] + matrix2[i][j];
         * }
         * }
         * for (int i=0; i<matrix1.length; i++) {
         * for (int j=0; j<matrix1[i].length; j++){
         * System.out.print(" " +result[i][j] + " ");
         * result [i][j] = matrix1[i][j] + matrix2[i][j];
         * }
         * System.out.println("");//new line print kar dega
         * }
         */

        /*
         * // very very
         * important********************************************************
         * // Reverse an Array
         * // koi bhi array me interchanging ke time greatest integer ka rule use kiya
         * // jaata h
         * // example - for an array [1,2,3,4,5] - interchange= [length/2] []- greatest
         * // integer
         * // example - for an array [1,2,3,4,5,6] - interchange= [length/2] []-
         * greatest
         * // integer
         * // example(1) - [3.558]= 3 ----- example(2) [7.8]= 7
         * // math.floordiv is a method used as a greatest integer func in java bcs it
         * // ignores decimals digits after decimal point
         * int[] array1 = { 5, 4, 3, 2, 1 };
         * int length = array1.length;
         * int temp;// swapping me ek khali dabba chahiye hota h jisme swapping start ho
         * // sake
         * // int a = Math.floorDiv(length, 2)); // a greatest integer mil jaega
         * int a = Math.floorDiv(length, 2);
         * // for (int i = 0; i < a; i++) {
         * // temp = array1[i];
         * // array1[i] = length - i - 1;
         * // array1[length - i - 1] = temp;
         * // }
         * // for (int x : array1) {
         * // System.out.print(x + " ");
         * // }
         * for (int i = length - 1; i >= 0; i--) {
         * System.out.print(array1[i] + " ");
         * }
         * // ye temporary variable banake tatti mehnat mat karo bsdk bas easy methods
         * // lagao na
         * 
         * // Finding maximum and minimum elements in an array
         * // int[] array1 = { 5, 4, 3, 2, 1,-82};
         * // int max=Integer.MIN_VALUE;
         * // System.out.println(Integer.MIN_VALUE);
         * // int min=Integer.MAX_VALUE;
         * // for(int x : array1){
         * // if (x>max){
         * // max = x;
         * // }
         * // if (x<min){
         * // min = x;
         * // }
         * // }
         * // System.out.println("maximum element in the array is : " + max);
         * // System.out.println("maximum element in the array is : " + min);
         * /*
         * 
         * // 2D Array making by taking input from User
         * System.out.println("Enter number of Rows");
         * int rows = sc.nextInt();
         * System.out.println("Enter number of Columns");
         * int cols = sc.nextInt();
         * int[][] matrix3 = new int[rows][cols];
         * // input of rows
         * System.out.println("Enter your matrix data");
         * for (int i = 0; i < rows; i++) {
         * // input of columns
         * for (int j = 0; j < cols; j++) {
         * matrix3[i][j] = sc.nextInt();
         * }
         * }
         * 
         * // condition if matrix has that element or not
         * System.out.println("Tell me the element you want to search for ?");
         * int x = sc.nextInt();
         * 
         * // output of 2D matrix
         * // System.out.println("Your matrix is :-");
         * for (int i = 0; i < rows; i++) {
         * for (int j = 0; j < cols; j++) {
         * if (matrix3[i][j] == x) {
         * System.out.printf("Your asked element was on the index (" + i + "," + j +
         * ")");
         * }
         * }
         * }
         */
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Long.MAX_VALUE);
        sc.close();
    }
}
