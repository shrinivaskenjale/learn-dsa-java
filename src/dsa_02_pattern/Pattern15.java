package dsa_02_pattern;

import java.util.Scanner;

// n=4
// A
// B C
// D E F
// G H I J
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x = 0;
        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {

                System.out.print((char) ('A' + x) + " ");
                x += 1;
            }
            System.out.println();
        }
    }
}
