package patternQuestions;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("row value");
        int row = scan.nextInt();
        System.out.println("col value");
        int col = scan.nextInt();

        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < col; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                System.out.print("*" + " ");
                for (int j = 0; j < col - 2; j++) {
                    System.out.print(" " + " ");
                }
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
