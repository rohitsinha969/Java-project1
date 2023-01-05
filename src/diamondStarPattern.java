//javac -d build/git/repo1/SupriyaJAVA/bit/src *.java
public class diamondStarPattern {
    public static void main(String[] args) {
        int lines = 6;
        int space = (lines * 2) - 2;
        for (int i = 1; i <= (lines / 2); i++) { // this loop is used to print one half lines
            boolean flagl = false;
            for (int l = 1; l <= i; l++) { // this loop is used to print the * in a line
                if (!flagl) {
                    System.out.print("*");
                    flagl = true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            for (int l = 1; l <= space; l++) {// this loop is used to print the space in a line
                System.out.print(" ");
            }
            space = space - 4;// Decrement space by 4
            boolean flagr = false;
            for (int l = 1; l <= i; l++) {
                if (!flagr) {
                    System.out.print("*");
                    flagr = true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }

            }
            System.out.println("\n");
        }
        space = space + 4;
        for (int i = (lines / 2); i >= 1; i--) {// this loop is used to print the one half lines
            boolean flagl = false;
            for (int l = 1; l <= i; l++)// this loop is used to print * in a line
            {
                if (!flagl) {
                    System.out.print("*");
                    flagl = true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }

            for (int l = 1; l <= space; l++)// this loop is used to print the space in a line
            {
                System.out.print(" ");
            }
            space = space + 4;// Increment space by 4
            boolean flagr = false;
            for (int l = 1; l <= i; l++)// this loop is used to print * in a line
            {
                if (!flagr) {
                    System.out.print("*");
                    flagr = true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }
    }
}
