package dsa_02_pattern;

import java.util.Scanner;

// n=4
//    *
//   **
//  ***
// ****

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // for (int i = 1; i <= n; i += 1) {
        // for (int j = 1; j <= n; j += 1) {
        // if (i + j > n) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i += 1) {
            // n-i times spaces
            for (int j = 1; j <= n - i; j += 1) {
                System.out.print("  ");
            }
            // i times *s
            for (int j = 1; j <= i; j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
