package dsa_02_pattern;

import java.util.Scanner;

// n=4
// D
// C D
// B C D
// A B C D

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                // (i,j)=> n-i+j
                // A => A-1+n-i+j = A
                System.out.print((char) ('A' - 1 + n - i + j) + " ");

            }
            System.out.println();
        }
    }
}
