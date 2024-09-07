package dsa_02_pattern;

import java.util.Scanner;

// n=4
// ****
// ***
// **
// *
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= (n - i + 1); j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
