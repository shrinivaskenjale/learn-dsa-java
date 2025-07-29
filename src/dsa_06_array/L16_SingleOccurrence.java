package dsa_06_array;

public class L16_SingleOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(solveOptimal(arr));
    }

    public static int solveOptimal(int[] arr) {
        int xor = 0;

        for (int num : arr) {
            xor = xor ^ num;
        }

        return xor;
    }
}

/*

Find a number in array which appears once where other elements appears exactly twice.

===============
Optimal
===============

Concept used:
x ^ x = 0
x ^ 0 = x

Time complexity: O(n)

Space complexity: O(1)

 */