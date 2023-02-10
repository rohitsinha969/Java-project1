package patternQuestions;

import java.util.Scanner;

public class fancyNumberTraingle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int val = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == row) {
                    System.out.print(val);
                } else {
                    System.out.print(val + "*");
                }
                val++;
            }
            System.out.println();
        }
        // val = 11
        // val = 11;
        for (int row = n; row > 0; row--) {
            val = val - row;
            int newVal = val;
            for (int col = row; col > 0; col--) {
                if (col == 1) {
                    System.out.print(val);
                } else {
                    System.out.print(val + "*");
                }
                val++;
            }
            val = newVal;
            System.out.println();
        }

        scan.close();
    }
}
