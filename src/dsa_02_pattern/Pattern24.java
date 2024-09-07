package dsa_02_pattern;

import java.util.Scanner;

// n=4 
//        1
//      2 3
//    4 5 6
// 7 8 9 10

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int value = 1;

        for (int i = 1; i <= n; i += 1) {
            // n-i spaces
            for (int j = 1; j <= (n - i); j += 1) {
                System.out.print("  ");
            }
            // i values
            for (int j = 1; j <= i; j += 1) {
                System.out.print(value + " ");
                value += 1;
            }
            System.out.println();
        }
    }
}
