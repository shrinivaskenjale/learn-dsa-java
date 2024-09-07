package dsa_02_pattern;

import java.util.Scanner;

// n=4
// 1
// 2 2
// 3 3 3
// 4 4 4 4

// no. of col in ith row is i
// value is i in ith row

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
