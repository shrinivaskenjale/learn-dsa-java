package dsa_03_patterns;


public class Pattern20 {
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
            // *
            int stars = n - spaces;
            for (int j = 1; j <= stars; j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

n=4

* * * *
  * * *
    * *
      *

 */