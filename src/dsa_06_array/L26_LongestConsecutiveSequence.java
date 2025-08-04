package dsa_06_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L26_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        // System.out.println(longestConsecutiveBrute(nums));
        // System.out.println(longestConsecutiveBetter(nums));
        System.out.println(longestConsecutiveOptimal(nums));

    }

    public static int longestConsecutiveBrute(int[] nums) {
        int longest = 0;

        for (int num : nums) {
            int currentNum = num;
            int currentStreak = 1;

            // Check if next consecutive numbers exist
            while (contains(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longest = Math.max(longest, currentStreak);
        }

        return longest;
    }

    // Helper method to check if array contains a value using linear search
    private static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static int longestConsecutiveBetter(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // Check if consecutive
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else {
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
            }
        }

        return Math.max(longest, currentStreak);
    }

    public static int longestConsecutiveOptimal(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num); // Step 1: Put all elements in a set
        }

        int longest = 0;

        for (int num : numSet) {
            // Step 2: Only start counting if it's the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Step 3: Count the consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}

/*

Given an unsorted array of integers nums, return the length of the longest sequence of
consecutive elements.

Input: nums = [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive sequence is [1, 2, 3, 4].

==================
Brute Force
==================

Intuition:
For each number, try to build the longest streak by checking if the next number exists.

1. Initialize variable `longest` to store the longest sequence length.
2. For each number in the array:
    a. Set current number and streak to 1.
    b. Check if the next consecutive number (num + 1) exists in the array.
    c. If it does, increase current number and streak.
    d. Repeat until no more consecutive numbers.
3. Update the longest sequence length if current streak is greater.
4. Return the longest length.

Time complexity: O(n²)
- O(n) for the outer loop
- O(n) for each call to contains()

Space complexity: O(n)


==========
Better
==========

Intuition:
Sorting brings consecutive numbers next to each other, so we can easily count streaks
in a single pass.

1. If the array is empty, return 0.
2. Sort the array.
3. Initialize:
   - longest = 1 (to track the maximum streak)
   - currentStreak = 1 (to track ongoing sequence)
4. Traverse the array from index 1:
   a. If current element is same as previous → skip (handle duplicates)
   b. If current is one more than previous → increase currentStreak
   c. Else → update longest and reset currentStreak to 1
5. After loop, return the max of longest and currentStreak.

Time complexity: O(n log n)
-  Sorting takes O(n log n)
- Iteration over each element takes O(n)

Space complexity: O(1)
- If in-place sorting algorithm is used


==============
Optimal
==============

Intuition:
- We only try to build a sequence from numbers that are starts of sequences, i.e., those
for which num - 1 is not present.
- This ensures each sequence is only counted once, avoiding redundant work.

1. Put all numbers in a HashSet to allow O(1) lookups.
2. For each number in the set:
   a. Check if it's the start of a sequence (i.e., num - 1 not in set).
   b. If yes, count how long the consecutive sequence goes:
      - Keep incrementing currentNum and checking if it's in the set.
      - Increment the streak counter.
   c. Update the longest streak found so far.
3. Return the maximum streak length.

Time complexity: O(n)
- Each number is processed at most once in the while loop across all iterations of
the outer loop.

Space complexity: O(n)
- For the HashSet
 */