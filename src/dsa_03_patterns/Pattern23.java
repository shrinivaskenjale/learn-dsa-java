package dsa_03_patterns;


public class Pattern23 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i += 1) {
            // Spaces
            int spaces = i - 1;
            for (int j = 1; j <= spaces; j += 1) {
                System.out.print("  ");
            }
            // Numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
n=4

1 2 3 4
  2 3 4
    3 4
      4
 */