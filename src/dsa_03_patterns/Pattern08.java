package dsa_03_patterns;


public class Pattern08 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int x = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}

/*
n=4

1
2 3
3 4 5
4 5 6 7

 */