package dsa_02_pattern;

import java.util.Scanner;

// n=3
// * * *
// * * *
// * * *

// Always establish relation between rows and cols using rows count.
// Or, try to find some formula with the combination of i,j & n.
// Here, no. of cols in each row is equal to rows count.

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        int x = 1;
        while (x <= rows) {
            int y = 1;
            while (y <= rows) {
                System.out.print("* ");
                y += 1;
            }
            System.out.println();
            x += 1;
        }

    }
}
