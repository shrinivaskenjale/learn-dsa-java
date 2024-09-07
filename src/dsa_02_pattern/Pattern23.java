package dsa_02_pattern;

import java.util.Scanner;

// n=4
// 1 2 3 4
//   2 3 4
//     3 4
//       4
public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            // i-1 spaces
            for (int j = 1; j <= (i - 1); j += 1) {
                System.out.print("  ");
            }
            // n-i+1 values
            for (int j = 1; j <= (n - i + 1); j += 1) {
                System.out.print(i + j - 1 + " ");
            }
            System.out.println();
        }
    }
}
