import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int esum = 0;
        int osum = 0;
        int answer = 0;
        int last;
        while (n > 0) {
            last = n % 10;

            if ((last % 2) == 0) {
                esum += last;
            } else {
                osum += last;
            }
            n /= 10;
        }
        answer = esum * osum;
        System.out.println(answer);
        sc.close();
    }
}
