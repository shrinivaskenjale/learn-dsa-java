package dsa_02_pattern;

import java.util.Scanner;

// n=3
// A B C
// B C D
// C D E

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i += 1) {
            // int start = 'A' + i - 1;
            // for (int j = 1; j <= n; j += 1) {
            // System.out.print((char) start + " ");
            // start += 1;
            // }

            // Using formula
            // If we map A-1 B-2 ...
            // Then we get relation that for (i,j) value would be i+j-1
            // For A => i+j-1 = 1
            // Adding A-1 on both sides,
            // A-1+i+j-1 = A-1+1
            // => A+i+j-2 = A
            for (int j = 1; j <= n; j += 1) {
                char ch = (char) ('A' + i + j - 2);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
