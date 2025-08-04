package dsa_06_array;

import java.util.Arrays;

public class L24_NextPermutation {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first index 'i' from the end where nums[i] < nums[i + 1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such an index exists, find index 'j' such that nums[j] > nums[i]
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix starting at i + 1 to make it the next smallest
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }


}

/*

You are given an array nums representing a permutation of n distinct integers.

Your task is to rearrange the numbers into the lexicographically next greater permutation
of numbers.

- If such a permutation exists, modify the array in-place to that next permutation.
- If the array is already the highest possible permutation (i.e., sorted in descending order),
rearrange it into the lowest possible permutation (i.e., sorted in ascending order).

Input: nums = [1, 2, 3]
Output: [1, 3, 2]

Input: nums = [3, 2, 1]
Output: [1, 2, 3]

===============
Brute Force
===============

Intuition:
Generate all permutations of the array, sort them in lexicographical order, and return the
next one after the current permutation.

This is highly inefficient for large arrays.
This is only practical for very small arrays (n <= 6).

Time Complexity: O(n! × n)
- Generating all permutations

Space Complexity: O(n!)
- Storing all permutations


===========
Optimal
===========

Intuition:
Find the first place from the end where the number can be increased to form a larger
permutation, swap it with the next larger number, and reverse the remaining part to make
it the smallest possible next permutation.

1. Start from the second-last index (i = n - 2) and move left to find the first index
   such that nums[i] < nums[i + 1]. This is the pivot point where an increase can be made.
2. If such an index 'i' is found:
   - Traverse from the end of the array to find the first index 'j' such that nums[j] > nums[i].
   - Swap nums[i] and nums[j].
3. Reverse the subarray from index i + 1 to the end of the array.
   - This ensures the suffix is the smallest possible to get the next lexicographic permutation.
4. If no such index 'i' is found (i.e., the array is in descending order),
   the entire array is the last permutation.
   - Reverse the whole array to convert it into the first (smallest) permutation.

Time Complexity: O(n)
- Single pass to find the pivot
- Single pass to find the swap index
- Single pass to reverse the suffix

Space Complexity: O(1)
- In-place rearrangement without using extra memory

 */