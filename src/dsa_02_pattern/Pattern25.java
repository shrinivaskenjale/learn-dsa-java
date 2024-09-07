package dsa_02_pattern;

import java.util.Scanner;

// n=4
//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            // n-i spaces
            for (int j = 1; j <= (n - i); j += 1) {
                System.out.print("  ");
            }
            // i-1 values
            for (int j = 1; j <= (i - 1); j += 1) {
                System.out.print(j + " ");
            }
            // i
            System.out.print(i + " ");
            // i-1 values
            for (int j = i - 1; j >= 1; j -= 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
