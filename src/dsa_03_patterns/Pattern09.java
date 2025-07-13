package dsa_03_patterns;


public class Pattern09 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
n=4

1
2 1
3 2 1
4 3 2 1

 */
