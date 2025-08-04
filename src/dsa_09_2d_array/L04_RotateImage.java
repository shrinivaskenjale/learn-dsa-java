package dsa_09_2d_array;

public class L04_RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // rotateBruteForce(matrix);
        rotateOptimal(matrix);
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

    public static void rotateBruteForce(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        // Copy elements to rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        // Copy back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotated[i][j];
            }
        }
    }

    public static void rotateOptimal(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

/*

You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).

Input:
matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]

Output:
[
  [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3]
]

===============
Brute Force
===============

Intuition:
We create a new matrix rotated of the same size and copy elements from the original matrix
to their rotated positions.

1. Create a new matrix of the same size as the original matrix.
2. Traverse each element (i, j) of the original matrix.
   - Place the element at (i, j) into position (j, n - 1 - i) in the new matrix.
3. Traverse the new matrix.
   - Copy each element back into the corresponding position in the original matrix.


Time Complexity: O(n²)
- Traversing the original matrix takes O(n²).
- Copying elements back from the new matrix also takes O(n²).
- Overall: O(n²) + O(n²) = O(n²)

Space Complexity: O(n²)
- An extra matrix of size n x n is used to store the rotated values.

=============
Optimal
=============

1. Transpose the matrix.
   - Swap each element at (i, j) with the element at (j, i) for all i < j.
   - This converts rows into columns.
2. Reverse each row of the transposed matrix.
   - For each row, swap elements from the beginning and end moving toward the center.
   - This finishes the 90-degree clockwise rotation.

Time Complexity: O(n²)
- Transposing the matrix takes O(n²).
- Reversing each row also takes O(n²).
- Overall: O(n²) + O(n²) = O(n²)

Space Complexity: O(1)
- The matrix is modified in-place without using any extra space.
- Only a few temporary variables are used for swapping.
 */
