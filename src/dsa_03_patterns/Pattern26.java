package dsa_03_patterns;


public class Pattern26 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i += 1) {
            // Left side numbers: 1 to n
            for (int j = 1; j <= (n - i + 1); j += 1) {
                System.out.print(j + " ");
            }
            // Stars: 2*(i-1) times
            for (int j = 1; j <= 2 * (i - 1); j += 1) {
                System.out.print("* ");
            }
            // Right side numbers: n to 1
            for (int j = (n - i + 1); j >= 1; j -= 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


/*

n=5

1 2 3 4 5 5 4 3 2 1
1 2 3 4 * * 4 3 2 1
1 2 3 * * * * 3 2 1
1 2 * * * * * * 2 1
1 * * * * * * * * 1

 */