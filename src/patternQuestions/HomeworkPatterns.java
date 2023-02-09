package patternQuestions;

import java.util.Scanner;

public class HomeworkPatterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Homework Pattern 1
        /*
        *
        **
        ***
        ****
        *****
        */
        /*
         * int n = scan.nextInt();
         * for(int i=1; i<=n; i++){
         * for(int j=1; j<=i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Homework Pattern 2
        /*
        *****
        ****
        ***
        **
        *
        */
        /*
         * int n = scan.nextInt();
         * for(int i=1; i<=n; i++){
         * for(int j=n; j>=i; j--){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Homework Pattern 3
        /*
         *******
         * ___*
         * __*
         * _*
         **
         *
         */
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 0 || i == n-1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print("_");
                    }
                }
            }
            System.out.println();
        }

        // Homework Pattern 10
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
        /*
         * int n = 5;
         * for (int row = 0; row < n; row++) {
         * // spaces printing
         * for (int col = 0; col < n - 1 - row; col++) {
         * System.out.print(" ");
         * }
         * // numbers printing
         * int start = 1;
         * for (int col = 0; col < 2 * row + 1; col++) {
         * // 1st line and last line handling
         * if (row == 0 || row == n - 1) {
         * // if last line has numbers on even columns
         * if ((col % 2) == 0) {
         * System.out.print(start);
         * start++;
         * }
         * // else space between these numbers
         * else {
         * System.out.print(" ");
         * }
         * }
         * // handling all other lines
         * else {
         * // every 1st column is having 1
         * if (col == 0) {
         * System.out.print(1);
         * }
         * // final column has an incremented number
         * else if (col == 2 * row + 1 - 1) {
         * System.out.print(row + 1);
         * }
         * // spaces between all the 1st and last number in the middle lines
         * else {
         * System.out.print(" ");
         * }
         * }
         * }
         * System.out.println();
         * }
         */

        // Homework Pattern 3
        /*
         * ________*
         ** ______**
         *** ____***
         **** __****
         ***********
         **** __****
         *** ____***
         ** ______**
         * ________*
         */
        /*
         * int n = scan.nextInt();
         * // 1st triangle
         * for (int row = 1; row <= n; row++) {
         * // stars
         * for (int col = 1; col <= row; col++) {
         * System.out.print("*");
         * }
         * // spaces in reverse
         * for (int col = row * 2; col <= 2 * n - 1; col++) {
         * System.out.print(" ");
         * }
         * // stars
         * for (int col = 1; col <= row; col++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * for (int row = 1; row <= n - 1; row++) {
         * // stars in reverse
         * for (int col = n - 1; col >= row; col--) {
         * System.out.print("*");
         * }
         * // spaces
         * for (int col = 1; col <= 2 * row; col++) {
         * System.out.print(" ");
         * }
         * // stars in reverse
         * for (int col = n - 1; col >= row; col--) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        scan.close();
    }
}
