package dsa_02_pattern;

import java.util.Scanner;

// n=4
// 1111
//  222
//   33
//    4

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            // i-1 times space
            for (int j = 1; j <= (i - 1); j += 1) {
                System.out.print("  ");
            }
            // n-i+1 times value
            for (int j = 1; j <= (n - i + 1); j += 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
