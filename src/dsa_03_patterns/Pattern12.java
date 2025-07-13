package dsa_03_patterns;


public class Pattern12 {
    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }

    public static void printPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}

/*
n=3

A B C
D E F
G H I

 */