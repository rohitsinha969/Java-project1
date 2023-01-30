package patternQuestions;

public class weirdNumberPattern {
    public static void main(String[] args) {
        /*
         * Print the pattern
         * 5 4 3 2 1 2 3 4 5
         * 4 1 1 4
         * 3 1 1 3
         * 2 1 1 2
         * 1 1
         */

        int n = 5;
        int space = n - 3;
        int odd = 1;
        int m = 0;
        for (int row = 0; row < n; row += 1) {
            if (row == 0) {
                for (int i = n; i > 0; i--) {
                    System.out.print(i);
                }
                for (int i = 2; i <= n; i++) {
                    System.out.print(i);
                }
            } else {
                System.out.print(n - row);
                for (space = n - 3 - m; space > 0; space--) {
                    System.out.print(" ");
                }
                System.out.print("1");
                for (int space1 = 1; space1 <= odd; space1++) {
                    System.out.print(" ");
                }
                System.out.print("1");
                for (space = n - 3 - m; space > 0; space--) {
                    System.out.print(" ");
                }
                System.out.print(n - row);
                m = m + 1;
                odd = odd + 2;
            }

            System.out.println();
        }
    }
}
