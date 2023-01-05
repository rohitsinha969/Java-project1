import java.util.*;

public class HappyNumber {
    public static boolean ishappy(int n) {
        Set<Integer> Sets = new HashSet<Integer>();
        int squareSum, rem;
        while (Sets.add(n)) {
            squareSum = 0;
            while (n > 0) {
                rem = n % 10;
                squareSum += rem * rem;
                n /= 10;
            }
            if (squareSum == 1) {
                return true;
            } else {
                n = squareSum;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ishappy(7));
        String a = "";
        System.out.println(a.length());
    }
}
