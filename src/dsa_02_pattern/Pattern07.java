package dsa_02_pattern;

import java.util.Scanner;

// n=4
// 1
// 2 3
// 4 5 6
// 7 8 9 10

// no. of cols in ith row is i
// value increments by 1

public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 1;
        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
    }
}
