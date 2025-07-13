package dsa_03_patterns;


public class Pattern04 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3d ", x++);
            }
            System.out.println();
        }
    }
}

/*
n=3

1 2 3
4 5 6
7 8 9


 */
