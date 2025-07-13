package dsa_03_patterns;


public class Pattern21 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i += 1) {
            // Space
            int spaces = i - 1;
            for (int j = 1; j <= spaces; j += 1) {
                System.out.print("  ");
            }
            // numbers
            int numbers = n - spaces;
            for (int j = 1; j <= numbers; j += 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
n=4

1 1 1 1
  2 2 2
    3 3
      4
 */