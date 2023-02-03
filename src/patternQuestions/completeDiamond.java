package patternQuestions;

import java.util.Scanner;

public class completeDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Upper Half of the Diamond

        for (int row = 0; row < n; row++) {
            // space printing
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            // stars printing
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Upper Half of the Diamond
        
        for (int i = 1; i < n; i++) {
            // space printing
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars printing
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}
