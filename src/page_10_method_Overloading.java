import java.util.Scanner;

public class page_10_method_Overloading {
    // Example of VOID RETURN TYPE in JAVA
    // static void tellJoke(){
    // System.out.println("a nation with no people - IMAGINATION");
    // }

    // Example of METHOD OVERLOADING
    // static void foo() {
    // System.out.println("I LOVE YOU");
    // }

    // static void foo(int a) {
    // System.out.println("I LOVE YOU " + a);
    // }

    // static void foo(int a, int b) {
    // System.out.println("I LOVE YOU " + a + " Would you like to have " + b + "
    // coffee ?");
    // }

    // Example of VARARGS
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int result(int... array1) {
    // int sum = 0;
    // for (int i : array1) {
    // sum = sum + i;
    // }
    // return sum;
    // }

    // Recursion in JAVA
    // static int factorial(int n) {
    // if (n == 0 || n == 1) {
    // return 1;
    // } else {
    // return n * factorial(n - 1);
    // }
    // }

    public static void main(String[] args) {
        // VOID RETURN TYPE
        // tellJoke();

        // METHOD OVERLOADING ------>
        // foo();
        // foo(3000);// argument is an actual value a= 3000 , this is an argument but
        // a,b was parameters
        // foo(3000, 1);

        // VARARGS in JAVA
        // System.out.println("The sum of numbers using VARARGS is : " + result(4, 5));
        // System.out.println("The sum of numbers using VARARGS is : " + result(4, 5, 7,
        // 9));

        // Recursion in JAVA
        // System.out.println(factorial(5));
        System.out.println("Give input");
        Scanner scan1 = new Scanner(System.in);
        int n = scan1.nextInt();
        String st = String.valueOf(n); // String to an Integer
        int num = Integer.parseInt(st.replace("0", "5"));
        System.out.println(num);
        scan1.close();
    }
}
