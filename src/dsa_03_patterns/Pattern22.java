package dsa_03_patterns;


public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i += 1) {
            // Spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j += 1) {
                System.out.print("  ");
            }
            // numbers
            for (int j = 1; j <= i; j += 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
n=4

      1
    2 2
  3 3 3
4 4 4 4
 */