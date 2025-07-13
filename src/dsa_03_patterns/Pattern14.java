package dsa_03_patterns;


public class Pattern14 {
    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i += 1) {
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j += 1) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

/*
n=3

A
B B
C C C
 */