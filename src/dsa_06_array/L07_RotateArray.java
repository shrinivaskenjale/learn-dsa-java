package dsa_06_array;

import java.util.Arrays;

public class L07_RotateArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        rightRotate(a, 2);
        System.out.println("right rotate: " + Arrays.toString(a));

        int[] b = { 1, 2, 3, 4, 5, 6 };
        leftRotate(b, 8); // equal to 2
        System.out.println("left rotate: " + Arrays.toString(b));
    }

    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
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
Right rotate array k times => put last k items in the beginning
Left rotate array k times => put first k items in the last

===============
Brute Force
===============

Right rotate k times:
1. For k times:
    a. Store the last element of the array in a temporary variable.
    b. Shift all other elements one position to the right (from end to start).
    c. Place the stored temporary value at index 0.

Left rotate k times:
1. For each of the k rotations:
    a. Store the first element of the array in a temporary variable.
    b. Shift all other elements one position to the left (from start to end).
    c. Place the stored temporary value at the last index.

Time Complexity: O(k × n)
- Each rotation takes O(n) time due to shifting.
- Repeating it k times results in O(k × n).

Space Complexity: O(1)
- No extra space used except a temporary variable.

=========
Better
=========

Right rotate k times:
1. Create a new array `temp` of the same size as the input array.
2. For each index i in the input array:
   - Place arr[i] at index (i + k) % n in the temp array.
3. Copy all elements from temp back to arr.

Left rotate k times:
1. Create a temporary array `temp` of the same size as the input.
2. For each index i in the input array:
   - Place arr[i] at index (i - k + n) % n in temp array.
     (we add 'n' to avoid negative indexing)
3. Copy all elements from temp back to arr.

Time Complexity: O(n)
- Each element is moved exactly once.

Space Complexity: O(n)
- Extra array used to store rotated version.


=============
Optimal
=============

Reversal Algorithm for Array Rotation

Right rotate k times:
1. Let n be the length of the array
2. If k > n, k = k % n
3. Reverse the last k elements
4. Reverse the remaining first (n - k) elements
5. Reverse the entire array

Left rotate k times:
1. Let n be the length of the array
2. If k > n, k = k % n
3. Reverse the first k elements
4. Reverse the remaining last (n - k) elements
5. Reverse the entire array



Time Complexity: O(n)
- Each reverse operation is O(n), done at most 3 times.

Space Complexity: O(1)
- All operations are in-place.

 */






