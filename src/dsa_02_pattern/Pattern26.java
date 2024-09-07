package dsa_02_pattern;

import java.util.Scanner;

// n=5
// 1 2 3 4 5 5 4 3 2 1
// 1 2 3 4 * * 4 3 2 1
// 1 2 3 * * * * 3 2 1
// 1 2 * * * * * * 2 1
// 1 * * * * * * * * 1

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            // n-i+1 values
            for (int j = 1; j <= (n - i + 1); j += 1) {
                System.out.print(j + " ");
            }
            // 2(i-1) spaces
            for (int j = 1; j <= 2 * (i - 1); j += 1) {
                System.out.print("* ");
            }
            // n-i+1 values
            for (int j = (n - i + 1); j >= 1; j -= 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
