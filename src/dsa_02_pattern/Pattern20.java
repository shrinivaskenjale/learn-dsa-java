package dsa_02_pattern;

import java.util.Scanner;

// n=4
// ****
//  ***
//   **
//    *

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            // i-1 times space
            for (int j = 1; j <= (i - 1); j += 1) {
                System.out.print("  ");
            }
            // n-i+1 times *
            for (int j = 1; j <= (n - i + 1); j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
