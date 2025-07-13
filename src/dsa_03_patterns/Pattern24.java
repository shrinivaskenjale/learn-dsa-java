package dsa_03_patterns;


public class Pattern24 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int value = 1;

        for (int i = 1; i <= n; i += 1) {
            // Spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j += 1) {
                System.out.print("    ");
            }
            // Values
            for (int j = 1; j <= i; j += 1) {
                System.out.printf("%3d ", value);
                value += 1;
            }
            System.out.println();
        }
    }
}

/*
n=4

       1
     2 3
   4 5 6
7 8 9 10

 */