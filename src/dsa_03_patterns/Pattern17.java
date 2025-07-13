package dsa_03_patterns;


public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i += 1) {
            char ch = (char) ('D' - i + 1);
            for (int j = 1; j <= i; j += 1) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

/*
n=4

D
C D
B C D
A B C D
 */