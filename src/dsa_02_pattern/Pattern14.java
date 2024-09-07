package dsa_02_pattern;

import java.util.Scanner;

// n=3
// A
// B B
// C C C

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                // A-1 B-2 ....
                // value at (i,j) is i
                // For A=> i=1 => A-1+i = A
                System.out.print((char) ('A' - 1 + i) + " ");
            }
            System.out.println();
        }
    }
}
