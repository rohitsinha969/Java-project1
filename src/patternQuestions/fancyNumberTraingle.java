package patternQuestions;

public class fancyNumberTraingle {
    public static void main(String[] args) {
        int rows = 4;
        int x = 1;

        // Print triangle in increasing order
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }

        // Print triangle in decreasing order
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((x-rows)+ " ");
            }
            System.out.println();
        }
    }
}
