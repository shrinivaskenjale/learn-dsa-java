package dsa_06_array;

import java.util.HashMap;
import java.util.Map;

public class L17_LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;

        System.out.println(longestSubarrayWithSumKBruteForce(arr, k));
    }

    public static int longestSubarrayWithSumKBruteForce(int[] arr, int k) {
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static int longestSubarrayWithSumKBetter(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Do not update if sum already exists
            // Edge case: arr=[2,0,0,3], k=3 => ans=3
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }


    public static int longestSubarrayWithSumKOptimal(int[] nums, int k) {
        int maxLen = 0;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            // Shrink window from left if sum exceeds k
            while (sum > k && start <= end) {
                sum -= nums[start];
                start++;
            }

            // Check for sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }

        return maxLen;
    }


}

/*

Find length of the longest subarray with sum k in array of integers.

Note - Better solution is the optimal solution if array contains 0s, positive integers and
negative integers.

=============
Brute Force
=============

Intuition:
Check the sum of every possible subarray and track the longest one whose sum equals k.

1. Initialize a variable maxLength = 0 to keep track of the maximum subarray length found
2. Loop through each starting index i from 0 to length of the array - 1:
   a. Initialize sum = 0
   b. Loop through each ending index j from i to length of the array - 1:
      - Add arr[j] to sum
      - If sum equals k:
         - Update maxLength = max(maxLength, j - i + 1)
3. After both loops complete, return maxLength

Time Complexity: O(n^2)
- Two nested loops go through all possible subarrays

Space Complexity: O(1)


Only positive integers ✅ Yes
Positive integers + 0s ✅ Yes
Positives, 0s, and negatives ✅ Yes

=========
Better
=========

If the array contains positives, 0s, and negative integers, then the prefix sum with
HashMap approach is the most optimal known solution.

Intuition:
- Use a running sum (prefix sum) to track the sum up to each index.
- If (sum - k) has been seen before, a subarray summing to k exists ending at current index.
- Store the first occurrence of each prefix sum to maximize subarray length.

1. Initialize:
   - A hashmap 'map' to store (prefix sum -> earliest index)
   - sum = 0 to keep track of the current prefix sum
   - maxLen = 0 to store the maximum subarray length found
2. Loop through the array from index i = 0 to nums.length - 1:
   a. Add nums[i] to sum
   b. If sum == k:
      - Update maxLen = i + 1 (entire subarray from 0 to i is valid)
   c. If (sum - k) exists in the map:
      - A subarray with sum = k exists between map.get(sum - k) + 1 and i
      - Update maxLen = max(maxLen, i - map.get(sum - k))
   d. If sum is not already present in the map:
      - Store (sum -> i) to preserve the earliest index for that sum
3. After the loop, return maxLen

Time Complexity: O(n)
- Single pass through the array with constant-time hashmap operations
- If there are collisions, using HashMap can lead to O(n^2)
- If TreeMap is used instead: O(n log n)

Space Complexity: O(n)
- Hashmap stores at most n prefix sums

Only positive integers ✅ Yes
Positive integers + 0s ✅ Yes
Positives, 0s, and negatives ✅ Yes

=========
Optimal
=========

Sliding window approach
- Use a sliding window to maintain a running sum; shrink the window when the sum exceeds k.

1. Initialize:
   - maxLen = 0 to store the maximum length of a valid subarray.
   - sum = 0 to store the current sum of the window.
   - start = 0 as the start index of the sliding window.
2. Traverse the array using end as the end index of the window:
   a. Add nums[end] to sum.
   b. While sum > k, shrink the window from the left:
      - Subtract nums[start] from sum.
      - Move start forward by 1.
   c. If sum == k, update maxLen with the current window length.
3. Return maxLen after the loop ends.


Time Complexity: O(n)
- Each element is processed at most twice (once by end pointer and once by start pointer
during shrinking), so the total time is linear.

Space Complexity: O(1)

Only positive integers ✅ Yes
Positive integers + 0s ✅ Yes
Positives, 0s, and negatives ❌ No

Caveat:
- Works only when all elements are non-negative — ensures window sum doesn't decrease
when expanded.
- For negative numbers, this approach doesn't work. You'd need prefix sums + hashmap.
- When all elements are non-negative, increasing the window increases the sum or keeps it same.

 */