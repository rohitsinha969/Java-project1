package patternQuestions;

public class HomeworkPatterns {
    public static void main(String[] args) {

        // Homework Pattern 1
        /*
         * ____1____
         * ___232___
         * __34543__
         * _4567654_
         * 567898765
         */
        /*
         * int n = 5;
         * for (int row = 0; row < n; row++) {
         * // spaces printing
         * for (int col = 0; col < n - 1 - row; col++) {
         * System.out.print(" ");
         * }
         * // number printing
         * for (int col = 0; col < row + 1; col++) {
         * System.out.print(row + col + 1);
         * }
         * // reverse printing;
         * int start = 2 * row;
         * for (int col = 0; col < row; col++) {
         * System.out.print(start);
         * start--;
         * }
         * System.out.println();
         * }
         */

        // Homework Pattern 2
        /*
         * ____1____
         * ___1_2___
         * __1___3__
         * _1_____4_
         * 1_______5
         */
        int n = 5;
        for (int row = 0; row < n; row++) {
            // spaces printing
            for (int col = 0; col < n - 1 - row; col++) {
                System.out.print(" ");
            }
            // numbers printing
            int start = 1;
            for (int col = 0; col < 2 * row + 1; col++) {
                // 1st line and last line handling
                if (row == 0 || row == n - 1) {
                    // if last line has numbers on even columns
                    if ((col % 2) == 0) {
                        System.out.print(start);
                        start++;
                    }
                    // else space between these numbers
                    else {
                        System.out.print(" ");
                    }
                }
                // handling all other lines
                else {
                    // every 1st column is having 1
                    if (col == 0) {
                        System.out.print(1);
                    }
                    // final column has an incremented number
                    else if (col == 2 * row + 1 - 1) {
                        System.out.print(row + 1);
                    }
                    // spaces between all the 1st and last number in the middle lines
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
