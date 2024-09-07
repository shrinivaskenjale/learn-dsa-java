package dsa_02_pattern;

import java.util.Scanner;

// n=3
// 1 2 3
// 4 5 6
// 7 8 9

// no. of cols is equal to n

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 1;

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                System.out.printf("%3d ", count);
                count += 1;
            }
            System.out.println();
        }
    }
}
