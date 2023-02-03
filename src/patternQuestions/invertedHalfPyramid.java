package patternQuestions;

import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * int n = scan.nextInt();
         * for (int row = 0; row < n; row++) {
         * for (int col = 0; col < n - row; col++) {
         * System.out.print("*" + " ");
         * }
         * System.out.println();
         * }
         */

        // Homework
        /*
         * _*_*_*_*
         * _*_*_*_*
         * __*_*_*
         * ___*_*
         * ____*
         */

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            // space printing
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();

    }
}
