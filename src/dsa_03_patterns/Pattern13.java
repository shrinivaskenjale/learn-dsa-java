package dsa_03_patterns;


public class Pattern13 {
    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int ch = 'A' + i - 1;
            for (int j = 1; j <= n; j++) {
                System.out.print((char) ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

/*
n=3

A B C
B C D
C D E

 */