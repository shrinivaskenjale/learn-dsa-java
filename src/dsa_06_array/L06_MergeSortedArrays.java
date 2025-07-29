package dsa_06_array;

import java.util.Arrays;

public class L06_MergeSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6};

        int[] merged = merge(nums1, nums2);
        System.out.println(Arrays.toString(merged));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }

        while (i < a.length) {
            ans[k++] = a[i++];
        }

        while (j < b.length) {
            ans[k++] = b[j++];
        }

        return ans;
    }
}



/*

Merge two sorted arrays to create new sorted array

=============
Brute Force
=============

1. Create a new array `ans` of size (length of a + length of b).
2. Copy all elements of array a into ans.
3. Copy all elements of array b into ans after the elements of a.
4. Sort the resulting array ans using any sorting method (e.g., bubble sort, Arrays.sort()).

Time Complexity: O((n + m) * log(n + m))
- O(n + m) for copying
- O((n + m) * log(n + m)) for sorting

Space Complexity: O(n + m)
- For storing the merged array

===========
Better
===========

There is no better approach.

================
Optimal
================

2 Pointer Technique

1. Create a new array `ans` of size (length of a + length of b).
2. Initialize three pointers:
   - i for array a (starts at 0)
   - j for array b (starts at 0)
   - k for result array ans (starts at 0)
3. While both arrays have elements:
   a. If a[i] <= b[j], assign a[i] to ans[k] and increment i and k.
   b. Else assign b[j] to ans[k] and increment j and k.
4. Copy any remaining elements from array a to ans.
5. Copy any remaining elements from array b to ans.
6. Return the merged sorted array `ans`.


Time Complexity: O(n + m)
- n = length of array a
- m = length of array b
- Each element is visited once.

Space Complexity: O(n + m)
- Extra space used to store the merged array.

 */