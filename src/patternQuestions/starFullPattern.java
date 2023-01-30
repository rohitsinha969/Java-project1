package patternQuestions;

import java.util.Scanner;

public class starFullPattern {
    public static void main(String[] args) {
        /*
         * print the pattern
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give an Input :- ");
        int n = scan.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
