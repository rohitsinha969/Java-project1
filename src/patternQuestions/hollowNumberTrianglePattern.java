package patternQuestions;

import java.util.Scanner;

public class hollowNumberTrianglePattern {
    public static void main(String[] args) {
        /*
         * Homework
         * Print the Pattern
         * ____1
         * ___1_2
         * __1___3
         * _1_____4
         * 1 2 3 4 5
         */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            // for number of spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                // for kth value i.e., 1 2 3 4 5.... upto n in last line and also in the right
                // diagonal
                if (i == 1 || k == 1 || i == n || k == i) {
                    System.out.print(" " + k);
                } else {
                    // for extra spaces between numbers
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
