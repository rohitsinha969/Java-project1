import java.util.Scanner;

public class minimumEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();

            System.out.println(findMinEnergy(input1, input2));
        }
        sc.close();
    }

    private static int findMinEnergy(int input1, int input2) {

        int ans = 0;

        if (input1 == 1 && input2 == 1)
            return 0;

        int min = Math.min(input1, input2);
        int max = Math.max(input1, input2);

        ans = (max - 1) + (min - 1) + (min);
        return ans;
    }
}
