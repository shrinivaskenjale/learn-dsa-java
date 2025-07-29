package dsa_06_array;

import java.util.Arrays;

public class L03_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

/*

Reverse the given array

=================
Brute Force
=================

1. Create a new array of the same length as the original.
2. Loop through the original array from end to start.
   a. For each element, copy it into the new array from start to end.
3. Overwrite the original array from start to end.

Time Complexity: O(n)
- One full traversal of the array.

Space Complexity: O(n)
- Extra array used to store reversed result.


================
Optimal
================

2 Pointer Technique

1. Initialize two pointers:
   - left = 0 (start of array)
   - right = n - 1 (end of array)
2. While left < right:
   a. Swap the elements at positions left and right.
   b. Increment left and decrement right.


Time Complexity: O(n)
- Each element is visited at most once.

Space Complexity: O(1)
- No extra space used; reversal is done in-place.
 */