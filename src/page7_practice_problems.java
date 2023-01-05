import java.util.Scanner;

public class page7_practice_problems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int i = scan.nextInt();
        // Double d = scan.nextDouble();

        // scan.nextLine();
        // String s = scan.nextLine();
        // System.out.println("String: " + s);
        // System.out.println("Double: " + d);
        // System.out.println("Int: " + i);

        // System.out.println("Enter a Number :-"); //reversing a number
        // int num=scan.nextInt();
        // int rem=0;
        // int rev=0;
        // while (num!=0) {
        // rem=num%10;
        // rev=rev*10+rem;
        // num=num/10;
        // }
        // System.out.println("The Reversed Number is : "+ rev);

        // String sc= scan.nextLine(); //String to an Integer
        // int num=Integer.parseInt(sc);
        // System.out.println("You gave me a string but i gave you a number "+num);

        // int num = scan.nextInt(); // Integer to String
        // System.out.println("You gave me a Number but i gave you a String " +
        // Integer.toString(num));

        // String s="age : 55"; //Extraction od constants from any string
        // s=s.replaceAll("\\D+", "");
        // System.out.println(s);
        // int n=Integer.parseInt(s); //on same extracts conversion of string to integer
        // System.out.println(n+2);

        // Sagar Sinha - String
        // 012345678910 - Index of each character (always starts from 0)

        /*
         * String name = scan.nextLine(); // Reversing a String
         * String rev = "";
         * int length = name.length();
         * for (int i = length - 1; i >= 0; i--) // length-1 isiliye kara kyunki index 0
         * se start
         * // hota h
         * {
         * rev = rev + name.charAt(i);
         * }
         * 
         * System.out.println("reverse is " + rev);
         * 
         */

        // int a=scan.nextInt();
        // for(int i=0;i<a;i++)
        // {
        // int b=i+1;
        // System.out.println(b);
        // }

        // System.out.println("give me a number"); // ******
        // int c = scan.nextInt(); // *****
        // for (int i = c; i >0; i--) { // ****
        // for (int j=0; j<i; j++){ // ***
        // System.out.print("*"); // **
        // } // *
        // System.out.print("\n");

        // }

        // sum of n even numbers starting from 0
        // System.out.println("give me a number");
        // int n = scan.nextInt();
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // sum = sum + (2 * i);
        // }
        // System.out.println("sum of n even numbers are : " + sum);

        // multiplication table of a number given by user
        // System.out.println("give me a number");
        // int n = scan.nextInt();
        // System.out.println("Multiplication Table of : ");
        // for(int i=1;i<=10;i++){
        // //System.out.println(n+"*"+i+"="+(n*i));
        // System.out.printf("%d X %d =%d\n" ,n,i,n*i);
        // }

        // multiplication table of a number given by user in reverse order
        // System.out.println("give me a number");
        // int n = scan.nextInt();
        // System.out.println("Multiplication Table of : "+n+" in reverse order");
        // for(int i=10;i>=1;i--){
        // //System.out.println(n+"*"+i+"="+(n*i));
        // System.out.printf("%d X %d =%d\n" ,n,i,n*i);
        // }

        // factorial of given number (using while loop)
        // System.out.println("give me a number");
        // int n = scan.nextInt();
        // int i = 1;
        // int factorial = 1;
        // while (i <= n) {
        // factorial *= i;
        // i++;
        // }
        // System.out.println(factorial);

        // factorial of given number (using for loop)
        /*
         * System.out.println("give me a number");
         * long n = scan.nextInt();
         * long factorial = 1;
         * for (long i = 1; i <= n; i++) {
         * factorial = factorial * i;
         * }
         * System.out.println(factorial);
         */

        String s = "abc";
        String sa = "abc";
        System.out.println(s.equalsIgnoreCase(sa));
        System.out.println(s.isEmpty());
        System.out.println(s.equals(sa));

        scan.close();

    }
}
