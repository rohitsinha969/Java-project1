public class page19_Recursion_in_JAVA {
    /*
     * // sum of n natural numbers
     * public static void printSum(int i, int n, int sum) {
     * if (i == n) {
     * sum += i;
     * System.out.println(sum);
     * return;
     * }
     * sum += i;
     * printSum(i + 1, n, sum);
     * }
     * 
     * public static int printSum(int n) {
     * if (n == 1) {
     * return 1;
     * }
     * if (n == 0) {
     * return 0;
     * }
     * int temp = n + printSum(n - 1);
     * return temp;
     * }
     */

    /*
     * // nth term of fibonacci series
     * static int fibo(int n) {
     * if (n == 0 || n == 1) {
     * return 0;
     * }
     * if (n == 2) {
     * return 1;
     * }
     * int pa1 = fibo(n - 1);
     * int pa2 = fibo(n - 2);
     * return pa1 + pa2;
     * }
     */

    /*
     * // nth power of x
     * static int getPow(int x, int n) {
     * if (n == 0) {
     * return 1;
     * }
     * if (x == 0 && n == 0) {
     * return 1;
     * }
     * if (x == 0) {
     * return 0;
     * }
     * int temp_value = getPow(x, n - 1);
     * return x * temp_value;
     * }
     * 
     * static int getPow(int x, int n) {
     * if (n == 0) {
     * return 1;
     * }
     * if (x == 0 && n == 0) {
     * return 1;
     * }
     * if (x == 0) {
     * return 0;
     * }
     * int temp_value = getPow(x, n / 2);
     * 
     * if (n % 2 == 1) {
     * return temp_value * temp_value * x;
     * }
     * return temp_value * temp_value;
     * }
     */

    /*
     * // check for palindrome using recursion
     * Boolean isPalindromeHELPER(int left, int right, String str){
     * if (left>=right) {
     * return true;
     * }
     * if (str.charAt(left)!= str.charAt(right)) {
     * return false;
     * }
     * return isPalindromeHELPER(left+1, right-1, str);
     * }
     * Boolean isPalindrome(String str){
     * str = "Apple";
     * return isPalindromeHELPER(0,str.length()-1,str);
     * 
     * }
     */

    public static void main(String[] args) {
        // sum of n natural numbers
        // printSum(1, 5, 0);
        // System.out.println(printSum(15));

        // nth term of fibonacci series
        // System.out.println(fibo(25));

        // nth power of x
        // System.out.println(getPow(0, 0));
        // System.out.println(getPow(25, 2));

    }
}
