import java.util.Scanner;

/**
 * pascal'sTriangle
 */
public class pascal {
    public int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        int row;
        pascal obj = new pascal();
        System.out.println("Enter number of Rows");

        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();

        for (int i = 0; i <= row; i++) {
            for (int k = 0; k <= row - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + obj.factorial(i) / (obj.factorial(i - j) * obj.factorial(j)));
            }
            System.out.println();
        }
        sc.close();
    }
}