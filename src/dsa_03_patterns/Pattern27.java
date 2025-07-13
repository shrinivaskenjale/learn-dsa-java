package dsa_03_patterns;

public class Pattern27 {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            int value = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = value ^ 1;
            }
            System.out.println();
        }
    }
}

/*
n=5

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */