package dsa_09_2d_array;

import java.util.ArrayList;
import java.util.List;

public class L05_SpiralMatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Traverse from Left to Right
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // Traverse from Top to Bottom
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // Traverse from Right to Left (if rows remain)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Traverse from Bottom to Top (if columns remain)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }
}

/*

Given an m x n matrix, return all elements of the matrix in spiral order.

You must start from the top-left corner, move right, then down, then left, then up, and
repeat this pattern while staying within bounds and avoiding visited cells.

Input: matrix = [
  [1,  2,  3],
  [4,  5,  6],
  [7,  8,  9]
]

Output:
[1, 2, 3, 6, 9, 8, 7, 4, 5]


=======================
Brute Force = Optimal
=======================

Intuition:
We treat the matrix like layers of an onion and peel off one layer at a time by moving in the
spiral direction: right → down → left → up, while shrinking the boundaries after each pass.

1. Initialize four boundaries: top, bottom, left, and right.
2. Loop while top <= bottom and left <= right:
   - Traverse from left to right along the top row.
   - Move the top boundary down.
   - Traverse from top to bottom along the right column.
   - Move the right boundary left.
   - If top <= bottom:
     - Traverse from right to left along the bottom row.
     - Move the bottom boundary up.
   - If left <= right:
     - Traverse from bottom to top along the left column.
     - Move the left boundary right.

Time Complexity: O(m × n)
- Each element is visited exactly once.

Space Complexity: O(1)
- No extra space is used except for the result list.
 */