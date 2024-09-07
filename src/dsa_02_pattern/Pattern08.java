package dsa_02_pattern;

import java.util.Scanner;

// n=4
// 1
// 2 3
// 3 4 5
// 4 5 6 7

// no. of cols in ith row is i
// value in ith row starts from i

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            int value = i; // never update looping variables
            for (int j = 1; j <= i; j += 1) {
                System.out.print(value + " ");
                value += 1;

                // System.out.print(i + j - 1 + " "); // without extra variable
            }
            System.out.println();
        }
    }
}
