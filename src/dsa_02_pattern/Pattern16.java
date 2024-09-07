package dsa_02_pattern;

import java.util.Scanner;

// n=4
// A 
// B C 
// C D E 
// D E F G
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                System.out.print((char) ('A' + i + j - 2) + " ");
            }
            System.out.println();
        }
    }
}
