package dsa_06_array;

import java.util.Arrays;

public class L05_Sort01 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 0, 1, 0};
        sort01Optimal(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort01Optimal(int[] arr) {
        int nextZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[nextZeroIndex];
                arr[nextZeroIndex] = 0;
                nextZeroIndex++;
            }
        }
    }
}

/*
Sort an array consisting of only 0s and 1s.

================
Brute Force
================

1. Use a built-in sorting method to sort the array.
2. Since the array contains only 0s and 1s, the sorting will automatically group all 0s before 1s.

Time Complexity: O(n log n)
- Due to the use of general-purpose sorting algorithm.

Space Complexity: Depends on sorting algorithm (usually O(1) or O(log n) for in-place sorts).

===========
Better
===========

1. Count the number of 0s in the array.
2. Fill the first 'count' elements with 0s.
3. Fill the rest of the array with 1s.

Time Complexity: O(n)
- Single pass to count, and another to fill.

Space Complexity: O(1)
- No extra space used (in-place overwrite).

===============
Optimal
===============

2 Pointer Technique

1. Initialize a pointer `nextZeroIndex = 0`.
   - It keeps track of the position where the next 0 should go.
2. Traverse the array from left to right using index `i`:
   a. If arr[i] == 0:
      - Swap arr[i] with arr[nextZeroIndex].
      - Increment nextZeroIndex (since a 0 has been placed correctly).
3. At the end of the loop, all 0s are at the beginning,
   and all 1s are at the end of the array.

Time Complexity: O(n)
- Single pass through the array.

Space Complexity: O(1)
- In-place sorting using constant space.

 */