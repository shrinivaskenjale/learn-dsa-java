package dsa_02_pattern;

import java.util.Scanner;

// n=4
//    1
//   22
//  333
// 4444

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            // n-i times spaces
            for (int j = 1; j <= n - i; j += 1) {
                System.out.print("  ");
            }
            // i times value
            for (int j = 1; j <= i; j += 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
