import java.util.*;

public class hollowRECTANGLE_using_Recurrsion_in_JAVA {
    static class Pattern {
        Scanner scan = new Scanner(System.in);
        public int n = scan.nextInt();
        public int m = scan.nextInt();

        public void getPattern(int a, int b) {
            a = this.n;
            b = this.m;
            {
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= b; j++) {
                        if (i == 1 || j == 1 || i == a || j == b) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Pattern objPattern = new Pattern();
        objPattern.getPattern(0, 0);
    }
}
