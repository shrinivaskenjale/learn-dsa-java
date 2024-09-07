package dsa_02_pattern;

import java.util.Scanner;

// n=3
// 1 1 1
// 2 2 2
// 3 3 3

// no. of cols in each row equals to row count. 
// ith row has i in its cols.

public class Pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i + " ");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
