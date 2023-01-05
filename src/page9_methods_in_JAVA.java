
public class page9_methods_in_JAVA {
    // static int logic(int x, int y) {
    // int z;
    // if (x > y) {
    // z = x + y;
    // } else {
    // z = (x + y) * 5;
    // }
    // return z;
    // }
    // static void arrayCHANGE(int [] arr) {
    // arr [0]= 98;
    // }

    // -----------------------------------------------------------------------------------------------------------
    // PRACTICE PROBLEMS on METHODS in JAVA

    // Multiplication table using methods
    // static int product(int n){
    // for(int i=1; i<=10; i++){
    // System.out.format("%d X %d = %d\n",n,i,n*i);
    // }
    // return n;
    // }
    // Making Pattern [* increment]
    // static int pattern1(int n){
    // for(int i=1; i<=n; i++){
    // for (int j=0; j<i; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // return n;
    // }

    // Recurssive funtion to find sum of n natural numbers
    // sum(n) = 1 + 2 + 3 + ... + n
    // sum(n) = 1 + 2 + 3 + ... + n-1 + n
    // sum(n) = n-1 + n
    // static int sumRec(int n){
    // if (n==1) {
    // return 1;
    // }
    // return n + sumRec(n-1);
    // }

    // Fibonacci Series using Recursion
    // static int fibo(int n) {
    // /*if (n == 1) {
    // return 0;
    // } else if (n == 2) {
    // return 1;*/
    // if (n==1 || n==2) {
    // return n-1;
    // }
    // else {
    // return fibo(n - 1) + fibo(n - 2);
    // }
    // }

    // Average of arguments using VARARGS
    static float average(float... array1) {
        float avg = 0;
        float sum = 0;
        for (float i : array1) {
            sum = sum + i;
            avg = (sum / array1.length);
        }
        //return sum;
        return avg;

    }

    public static void main(String[] args) {
        /*
         * //page9_methods_in_JAVA obj = new page9_methods_in_JAVA();
         * int a = 5;
         * int b = 7;
         * int c;
         * c = logic(a, b);// way of calling method or function n number of times for
         * same job
         * // c = obj.logic(a, b);
         * 
         * // Traditional way of using loops again and again
         * int a1 = 2;
         * int b1 = 1;
         * int c1;
         * c1 = logic(a1, b1);
         * // c1 = obj.logic(a1, b1);// way of calling method or function n number of
         * times
         * // for same job
         * // if static is not used in logic making method then use this way :-
         * // make object using class_name object = new class_name();
         * // variable = object.object_name(constraints);
         * // example----------> methods_in_JAVA object = new methods_in_JAVA();
         * // -----------------> c = object.mySum(a,b);
         * if (a1 < b1) {
         * c1 = a1 + b1;
         * } else {
         * c1 = (a1 + b1) * 5;
         * }
         * System.out.println(c);
         * System.out.println(c1);
         */

        // Using methods in arrays
        // Will array change under INVOCATION module of JAVA
        // int [] marks = {45, 78, 85, 58, 96, 99};
        // arrayCHANGE(marks);
        // System.out.println(marks[0]);

        // -----------------------------------------------------------------------------------------------------------
        // PRACTICE PROBLEMS on METHODS in JAVA

        // Multiplication table using methods
        // product(5);

        // Making Pattern [* increment]
        // pattern1(5);

        // Recurssive funtion to find sum of n natural numbers
        // System.out.println(sumRec(5));

        // Fibonacci Series using Recursion
        // System.out.println(fibo(10));

        // Average of arguments using VARARGS
        System.out.println(average(4, 5, 9, 8));
        
        

    }

}
