import java.util.Arrays;
import java.util.Scanner;

public class primeORnot {
    // static int fastPower(int a, int b) {
    // int result = 1;

    // while (b > 0) {
    // if ((b & 1) != 0) {
    // result = result * a;
    // }
    // a = a * a;
    // b = b >> 1;
    // }

    // return result;
    // }
    static long fastPower(long a, long b, int n) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = (result * a % n) % n;
            }
            a = (a % n * a % n) % n;
            b = b >> 1;
        }

        return result;
    }

    /*
     * static boolean[] seiveOFerastothenes(int n) {
     * boolean[] temp = new boolean[n + 1];
     * Arrays.fill(temp, true);
     * temp[0] = false;
     * temp[1] = false;
     * for (int i = 2; i * i <= n; i++) {
     * for (int j = 2 * i; j <= n; j += i) {
     * temp[j] = false;
     * }
     * }
     * return temp;
     * }
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * System.out.println("Give me a number buddy ...");
         * int n = scan.nextInt();
         * boolean temp[] = seiveOFerastothenes(n);
         * System.out.println("All prime numbers between 1 and N is :- ");
         * 
         * for (int i = 0; i <= n; i++) {
         * if (temp[i] == true) {
         * System.out.print(i + " ");
         * }
         * }
         */

        System.out.println(fastPower(61544646, 5, 1000000007));

        scan.close();
    }
}
