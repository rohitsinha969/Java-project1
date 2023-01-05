import java.util.Scanner;

public class page2 {
    public static void main(String[] args) {
        // Lets Write our code here
        System.out.println("CBSE Percentage Calculator");
        System.out.println("This calculator can calculate your CBSE percentage depending on your marks");
        System.out.println("Give me your marks(out of 100) and i will tell you your percentage");
        System.out.println("Total marks for respective subjects are 440 (70+70+100+100+100)");
        float b = 440;
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks you scored in Physics (out of 70)");
        float phy = marks.nextFloat();
        System.out.println("Enter the marks you scored in Chemistry (out of 70)");
        float chem = marks.nextFloat();
        System.out.println("Enter the marks you scored in Mathematics (out of 100)");
        float maths = marks.nextFloat();
        System.out.println("Enter the marks you scored in English (out of 100)");
        float eng = marks.nextFloat();
        System.out.println("Enter the marks you scored in Physical Education (out of 100)");
        float ped = marks.nextFloat();
        float a1 = (phy + chem + maths + eng + ped) / b;
        float a2 = a1 * 100;
        System.out.println("Your percentage is :- " + a2 + " , do a bit more effort next time.6");
        marks.close();
    }

}
