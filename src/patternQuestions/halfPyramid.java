package patternQuestions;

import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
