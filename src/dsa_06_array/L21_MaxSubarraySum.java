package dsa_06_array;

import java.util.Arrays;

public class L21_MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(getMaxSubarraySumBruteForce(arr));
        System.out.println(getMaxSubarraySumOptimal(arr));
        System.out.println(Arrays.toString(getMaxSubarrayOptimal(arr)));
    }

    public static int getMaxSubarraySumBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int getMaxSubarraySumOptimal(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : arr) {
            sum += num;

            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static int[] getMaxSubarrayOptimal(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, tempStart = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1; // next subarray may start here
            }
        }

        // Extract the subarray
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}

/*

Find the maximum sum of elements of any contiguous subarray within a given array.


================
Brute Force
================

Intuition:
Check the sum of all possible subarrays starting from each index and keep track of the
maximum sum found so far.

1. Initialize maxSum to the smallest possible integer value.
2. Loop over each starting index `i` from 0 to end of array:
    3.   Initialize a variable `sum` to 0.
    4.   Loop from index `j = i` to the end of array:
         a. Add element at index `j` to `sum`.
         b. Update maxSum if current `sum` is greater than maxSum.
5. Return maxSum.


Time Complexity: O(n^2)
- Outer loop runs n times.
- Inner loop runs up to n times for each i.
- So total number of iterations is roughly n(n+1)/2 = O(n^2).

Space Complexity: O(1)


=============
Optimal
=============

Kadane's Algorithm
- Kadane's algorithm scans the array from left to right, keeping track of the maximum
subarray sum ending at the current index.

Intuition:
- We want the maximum sum of a contiguous subarray.
- As we move through the array, we maintain a running total (currentSum).
- If currentSum is positive, we keep adding to it.
- If currentSum becomes negative, we drop it — because it will only hurt future sums.
- At every step, we compare and update the best sum seen so far (maxSum).
- This way, we always track the best possible subarray ending at each position.

1. Initialize:
   - maxSum = smallest possible integer (to track the maximum sum found so far)
   - currentSum = 0 (to store sum of current subarray)
2. Traverse the array from left to right:
   a. Add current element to currentSum.
   b. Update maxSum if currentSum is greater than maxSum.
   c. If currentSum becomes negative, reset it to 0 (drop the subarray).
3. Return maxSum.


To find the actual subarray (not just the maximum sum) using Kadane’s Algorithm, you need
to track the start and end indices of the maximum subarray while scanning the array.


Time Complexity: O(n)
- Only one pass through the array.

Space Complexity: O(1)
- Uses only a few integer variables, no extra space required.



 */