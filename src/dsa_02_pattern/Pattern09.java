package dsa_02_pattern;

import java.util.Scanner;

// n=4
// 1
// 2 1
// 3 2 1
// 4 3 2 1

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            for (int j = i; j >= 1; j -= 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
