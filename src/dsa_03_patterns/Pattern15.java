package dsa_03_patterns;


public class Pattern15 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
/*
n=4

A
B C
D E F
G H I J

 */