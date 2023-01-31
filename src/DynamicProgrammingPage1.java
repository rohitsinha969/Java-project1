public class DynamicProgrammingPage1 {

    // Dynamic Programming Methods to find Nth Fibonacci Number
    public static int fibonacci(int n, int[] dp) {
        return n;
        /*
         * // Recursion + Memoization Approach
         * // Top-Down Approach in DP
         * if (n == 0 || n == 1)
         * return n;
         * if (dp[n] != -1)
         * return dp[n];
         * dp[n] = fibonacci((n - 1), dp) + fibonacci((n - 2), dp);
         * return dp[n];
         */

        /*
         * // Tabulation Approach
         * // Bottom-Up Approach in DP
         * if (n == 0 || n == 1) {
         * return n;
         * }
         * dp[0] = 0;
         * dp[1] = 1;
         * 
         * for (int i = 2; i <= n; i++) {
         * dp[i] = dp[i - 1] + dp[i - 2];
         * }
         * return dp[n];
         */
    }

    public static void main(String[] args) {
        int n = 5;
        /*
         * int dp[] = new int[n + 1];
         * for (int i = 0; i < dp.length; i++) {
         * dp[i] = -1;
         * }
         */

        // Space Optimisation method
        if(n==0){
            System.out.println(0);
        }else{        
            int prev1 = 1;
            int prev2 = 0;
            for (int i = 2; i <= n; i++) {
                int curr = prev1 + prev2;
                prev2 = prev1;
                prev1 = curr;
            }
            // System.out.println(fibonacci(n - 1, dp));
            System.out.println(prev1);
        }
    }
}
