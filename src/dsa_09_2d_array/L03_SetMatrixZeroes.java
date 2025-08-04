package dsa_09_2d_array;

import java.util.HashSet;
import java.util.Set;

public class L03_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        // setZeroesBruteForce(matrix);
        // setZeroesBetter(matrix);
        setZeroesOptimal(matrix);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroesBruteForce(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // First pass: mark cells that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // Mark row
                    for (int col = 0; col < n; col++) {
                        if (matrix[i][col] != 0) {
                            matrix[i][col] = -1000001; // placeholder
                        }
                    }
                    // Mark column
                    for (int row = 0; row < m; row++) {
                        if (matrix[row][j] != 0) {
                            matrix[row][j] = -1000001; // placeholder
                        }
                    }
                }
            }
        }

        // Second pass: replace placeholders with 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1000001) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeroesBetter(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Step 1: Identify rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Set cells to 0 if they are in a marked row or column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeroesOptimal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check if first row and first column need to be zeroed
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: Use first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark col
                }
            }
        }

        // Step 3: Zero out cells based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero out first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 5: Zero out first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}

/*
Given an m x n integer matrix, if an element is 0, set its entire row and column to 0.

Input:
matrix = [
  [0, 1, 2, 0],
  [3, 4, 5, 2],
  [1, 3, 1, 5]
]

Output:
[
  [0, 0, 0, 0],
  [0, 4, 5, 0],
  [0, 3, 1, 0]
]

================
Brute Force
================

Intuition:
- When we find a 0, we mark all elements in its row and column to be set to 0 later.
— Not immediately — otherwise we might incorrectly zero out parts of the matrix too early.

1. Traverse the matrix.
   - When a 0 is found at (i, j), mark all elements in row i and column j
     that are not already 0 with a placeholder value (-1000001).
2. Traverse the matrix again.
   - Replace all placeholder values with 0.
Note: Placeholder must be a number not allowed in original input (outside constraint).

Time complexity: O((m + n) * m * n)
- In worst case, all elements can be 0, so each zero can trigger row + col traversal.

Space complexity: O(1)

==============
Better
==============

Intuition:
First remember where the 0s are, then apply zeroing in the second pass.

1. Create two boolean arrays:
   - row[m] to mark which rows contain at least one 0
   - col[n] to mark which columns contain at least one 0
2. Traverse the matrix:
   - If matrix[i][j] == 0, mark row[i] and col[j] as true
3. Traverse the matrix again:
   - If row[i] or col[j] is true, set matrix[i][j] = 0

Time complexity: O(m * n)
- First pass takes O(m * n)
- Second pass takes O(m * n)

Space complexity: O(m + n)
- Row array takes O(m)
- Column array takes O(n)


============
Optimal
============

Intuition:
- We use the first row and first column as storage to remember which rows and columns
need to be zeroed, avoiding extra space.
- Two separate flags track whether the first row or column itself should be zeroed.

1. Use two boolean flags to track if the first row and column need to be zeroed.
2. Iterate over the matrix (excluding first row and col):
   - If matrix[i][j] == 0, mark row i and column j by setting matrix[i][0] and matrix[0][j] to 0
3. Iterate again (excluding first row and col):
   - If either matrix[i][0] or matrix[0][j] is 0, set matrix[i][j] = 0
4. Finally, zero out the first row and/or column if the flags were set


Time complexity: O(m * n)

Space complexity: O(1)

 */