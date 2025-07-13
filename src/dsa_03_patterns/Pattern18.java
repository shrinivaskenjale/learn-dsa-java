package dsa_03_patterns;


public class Pattern18 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n){
        for (int i = 1; i <= n; i += 1) {
            // n-i times spaces
            for (int j = 1; j <= n - i; j += 1) {
                System.out.print("  ");
            }
            // i times *
            for (int j = 1; j <= i; j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
n=4

      *
    * *
  * * *
* * * *

 */