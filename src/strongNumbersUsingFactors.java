import java.util.Scanner;

public class strongNumbersUsingFactors {
    public static boolean factorSum(int n) {
        int originalNum = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if ((n % i) == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // int n = 28;
        // for(int i=0; i<=100000; i++){
        // if(factorSum(i)==true){
        // System.out.print(i + " ");
        // }
        // }

        Scanner gettScanner = new Scanner(System.in);
        System.out.println("Give an Input :- ");
        int n = gettScanner.nextInt();
        if (factorSum(n) == true) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
        gettScanner.close();
    }
}
