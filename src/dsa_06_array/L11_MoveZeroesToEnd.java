package dsa_06_array;

import java.util.Arrays;

public class L11_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveZeroesToEndOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToEndOptimal(int[] arr) {
        int nextNonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, nextNonZeroIndex);
                nextNonZeroIndex++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
====================
Brute Force
====================

1. Create a list
2. Iterate over an array and insert all non-zero elements in list
3. Now iterate over the list and insert the list elements in the beginning of array
4. Fill end of array with 0s

Time complexity: O(n)
- Iteration over array will take O(n)
- Iteration over list will take O(n)

Space complexity: O(n)


=================
Optimal
=================

1. Initialize a variable nextNonZeroIndex = 0
   - It keeps track of the position where the next non-zero element should be placed.
2. Iterate through the array from index i = 0 to arr.length - 1:
   a. If arr[i] is not zero:
      - Swap arr[i] with arr[nextNonZeroIndex]
      - Increment nextNonZeroIndex by 1
3. After the loop, all non-zero elements will be shifted to the front (in original order),
and all zeroes will be at the end.


Time complexity: O(n)
- Each element is visited once.

Space complexity: O(1)

 */