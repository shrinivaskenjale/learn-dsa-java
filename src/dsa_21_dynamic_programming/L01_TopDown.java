package dsa_21_dynamic_programming;

import java.util.*;

public class L01_TopDown {
    public static void main(String[] args) {
        int n = 6;
        // create ds
        // our recursive function has only 1 variable
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(fib(n, dp));

    }

    static int fib(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        // check if solution exists in ds
        if (dp[n] != -1) {
            return dp[n];
        }

        // store the answer before returning
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}
