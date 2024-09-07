package dsa_02_pattern;

import java.util.Scanner;

// n=4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4

// no. of cols is equal to rows count
// value in jth col is j

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i += 1) {
            for (int j = n; j >= 1; j -= 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
