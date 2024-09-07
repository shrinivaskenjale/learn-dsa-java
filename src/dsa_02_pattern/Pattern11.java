package dsa_02_pattern;

import java.util.Scanner;

// n=3
// A B C
// A B C
// A B C

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            char ch = 'A';
            for (int j = 1; j <= n; j += 1) {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);

            }
            System.out.println();
        }
    }
}
