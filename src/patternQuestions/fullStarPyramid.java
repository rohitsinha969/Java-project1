package patternQuestions;

import java.util.Scanner;

public class fullStarPyramid {
    public static void main(String[] args) {
        // Homework
        /*
         * pattern :-
        _____*
        ____*_*
        ___*_*_*
        __*_*_*_*
        _*_*_*_*_*
         */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
