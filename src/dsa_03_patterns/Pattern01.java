package dsa_03_patterns;

public class Pattern01 {
    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
n=3

* * *
* * *
* * *

Always establish relation between rows and cols using rows count.
Or, try to find some formula with the combination of i,j & n.
Here, no. of cols in each row is equal to rows count.

 */