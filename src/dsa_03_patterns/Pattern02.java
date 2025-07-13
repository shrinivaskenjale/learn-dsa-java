package dsa_03_patterns;


public class Pattern02 {
    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
n=3

1 1 1
2 2 2
3 3 3
*/