package dsa_02_pattern;

import java.util.Scanner;

// n=3
// A A A
// B B B
// C C C

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ch = 'A';
        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                System.out.print((char) ch + " ");
            }
            ch += 1;
            System.out.println();
        }
    }
}
