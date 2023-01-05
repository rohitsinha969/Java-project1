import java.util.Scanner;

public class page1 {
    public static void main(String[] args) {
        // Lets Write our code here
        System.out.println("hi bro how's going everything ?");
        System.out.println("how may I help you this time");
        Scanner data1 = new Scanner(System.in);
        System.out.println("Enter Your Numbers buddy (number 1)");
        int a = data1.nextInt();
        // boolean tt= data1.hasNextInt();
        // System.out.println(tt);
        System.out.println("Enter Your Numbers buddy (number 2)");
        // boolean ff= data1.hasNextInt();
        // System.out.println(ff);
        int b = data1.nextInt();
        int sum = a + b;
        System.out.println("Your desired addition of values given by you is :");
        System.out.println(sum);
        data1.close();
    }
}
