package dsa_06_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L23_RearrangeAlternateBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        rearrangeBruteForce(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void rearrangeBruteForce(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Step 1: Separate positives and negatives while preserving order
        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        // Step 2: Overwrite original array with alternating elements
        int positiveIndex = 0, negativeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positives.get(positiveIndex++);
            } else {
                nums[i] = negatives.get(negativeIndex++);
            }
        }
    }
}

/*

You are given an array nums of even length n, containing exactly n/2 positive integers and
n/2 negative integers. Your task is to rearrange the elements of the array such that:

- The resulting array alternates between positive and negative numbers, starting with a
positive number.
- The relative order of positive numbers and the relative order of negative numbers must
remain the same as in the original array.

Input:  nums = [3, -2, -1, 2, -3, 1]
Output: [3, -2, 2, -1, 1, -3]


=======================
Brute Force & Optimal
=======================

Intuition:
First collect positives and negatives in order, then alternate them back into the original
array to maintain the required pattern and relative order.

1. Create two empty lists:
   - `positives` to store all positive numbers in original order.
   - `negatives` to store all negative numbers in original order.
2. Traverse the input array once:
   - If the current number is positive, add it to `positives`.
   - If the current number is negative, add it to `negatives`.
3. Initialize two index pointers:
   - `positiveIndex` for tracking current index in `positives` list.
   - `negativeIndex` for tracking current index in `negatives` list.
4. Traverse the original array again:
   - For even indices (i % 2 == 0), place the next positive number from `positives`.
   - For odd indices  (i % 2 == 1), place the next negative number from `negatives`.

Time Complexity: O(n)
- One pass to split into positives and negatives → O(n)
- One pass to overwrite the array → O(n)

Space Complexity: O(n)
- Extra space used for two temporary lists to hold positives and negatives
 */