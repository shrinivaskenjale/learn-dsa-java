package dsa_03_patterns;


public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i += 1) {
            // Left spaces
            for (int j = 1; j <= (n - i); j += 1) {
                System.out.print("  ");
            }

            // Values before center column: 1 to i-1
            for (int j = 1; j <= (i - 1); j += 1) {
                System.out.print(j + " ");
            }

            // Center column: i
            System.out.print(i + " ");

            // Values after center column: i-1 to 1
            for (int j = i - 1; j >= 1; j -= 1) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/*
n=4

      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1

 */