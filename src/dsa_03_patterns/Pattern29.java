package dsa_03_patterns;

public class Pattern29 {

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int left = j;
                int right = 2 * n - 2 - j;
                int top = i;
                int bottom = 2 * n - 2 - i;

                int minDistance = Math.min(Math.min(left, right), Math.min(top, bottom));
                int value = 4 - minDistance;

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

/*
n=4

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

==========
Solution
==========

For given n, matrix dimension would be 2*n-1 X 2*n-1.

For each coordinate, get the minimum distance from all 4 sides.
Subtract that minimum distance from 4 to get value for that coordinate.

For 0 based indexing,
=> distance from top = i
=> distance from bottom = (2*n - 2) - i
=> distance from left = j
=> distance from right = (2*n - 2) - j


Min distance matrix would be:
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 1 2 2 2 1 0
0 1 2 3 2 1 0
0 1 2 2 2 1 0
0 1 1 1 1 1 0
0 0 0 0 0 0 0

Subtract each value from 4 to get final matrix.

 */
