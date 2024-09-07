package dsa_21_dynamic_programming;

import java.util.Arrays;

public class L02_BottomUp {
    public static void main(String[] args) {
        int n = 8;

        // create ds
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // base case
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {

            // convert recursive call into ds access
            // map the loop variables to parameters of recursive function
            // n => i
            // dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
