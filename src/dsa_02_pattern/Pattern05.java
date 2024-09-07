package dsa_02_pattern;

import java.util.Scanner;

// n=4
// *
// **
// ***
// ****

// no. of cols in ith row is i

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
