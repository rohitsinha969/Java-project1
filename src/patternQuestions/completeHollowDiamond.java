package patternQuestions;

import java.util.Scanner;

public class completeHollowDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Upper Half of the Diamond

        for (int row = 0; row < n; row++) {
            // spaces before the diamond
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            // spaces between the diamond
            for (int col = 0; col < 2 * row + 1; col++) {
                // stars at diagonals or boundaries
                if (col == 0 || col == 2 * row) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower Half of the Diamond

        for (int row = 1; row < n; row++) {
            // spaces before the diamond
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            // spaces between the diamond
            for (int col = 0; col < 2 * n - 2 * row - 1; col++) {
                // stars at diagonals or boundaries
                if (col == 0 || col == 2 * n - 2 * row - 1 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}
