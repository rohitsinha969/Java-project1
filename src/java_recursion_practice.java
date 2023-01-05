//import java.util.*;

public class java_recursion_practice {
    /*
     * // Factorial using Recursion in JAVA
     * public static int getFactorial(int n) {
     * if (n == 1 || n == 0) {
     * return 1;
     * }
     * int fact_n_1 = getFactorial(n - 1);
     * int fact_n = n * fact_n_1;
     * return fact_n;
     * }
     */

    /*
     * // Fibonacci Series using Recursion in JAVA
     * public static void fibo(int a, int b, int n) {
     * if (n == 0) {
     * return;
     * }
     * int count =0;
     * int c = a + b;
     * System.out.print(c + " ");
     * fibo(b, c, n - 1);
     * 
     * }
     */

    // X^n using Recursion
    /*
     * public static int getPow(int x, int n) {
     * if (n == 0) {
     * return 1;
     * }
     * // if (n == 1) {
     * // return 2;
     * // }
     * if (x == 0) {
     * return 0;
     * }
     * int a = getPow(x, n - 1);
     * int b = x * a;
     * return b;
     * 
     * }
     */

    public static void main(String[] args) {

        /*
         * // Factorial using Recursion in JAVA
         * int ans = getFactorial(5);
         * System.out.println(ans);
         */

        /*
         * // Fibonacci Series using Recursion in JAVA
         * int a = 0;
         * int b = 1;
         * System.out.print(a + " ");
         * System.out.print(b + " ");
         * int n = 7;
         * fibo(a, b, n - 2);
         */

        /*
         * // X^n using Recursion
         * int ans = getPow(2, 15);
         * System.out.println(ans);
         */

        long n =5;
        long fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
        long rem =0;
        while(fact>0){
            long digit = fact % 10;
            rem = rem+digit;
            fact = fact/10;
        }
        System.out.println(rem);
    }
}
