package dsa_03_patterns;


public class Pattern03 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
n=4

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

 */
