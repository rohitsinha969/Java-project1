package patternQuestions;

import java.util.Scanner;

public class numericInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
