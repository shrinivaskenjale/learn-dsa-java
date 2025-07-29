package dsa_06_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L18_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int k = 14;
        // System.out.println(checkTwoSumBruteForce(arr, k));
        // System.out.println(checkTwoSumBetter(arr, k));
        System.out.println(checkTwoSumOptimal(arr, k));
    }

    public static boolean checkTwoSumBruteForce(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) return true;
            }
        }
        return false;
    }

    public static boolean checkTwoSumBetter(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = k - arr[i];
            if (map.containsKey(remaining)) return true;
            map.put(arr[i], i);
        }
        return false;
    }

    public static boolean checkTwoSumOptimal(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == k) return true;

            if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}

/*
Type A: Check whether given array contains 2 numbers whose sum is k

Type B: Array contains 2 numbers whose sum is k, find indices of those numbers

=================
Brute Force
=================

Intuition:
- Check all possible pairs one by one.

1. Get the length of the input array.
2. Traverse the array using index i from 0 to n-1.
3. For each element at index i, traverse the remaining elements using index j from i+1 to n-1.
4. For each pair (i, j), check if arr[i] + arr[j] == k.
5. If such a pair is found, return true.
6. If no such pair exists after all iterations, return false.

Time Complexity: O(n^2)

Space Complexity: O(1)


===========
Better
===========


1. Create an empty HashMap to store array elements as keys and their indices as values.
2. Iterate through each element in the array:
   a. Calculate the remaining value needed to reach the target sum: remaining = k - arr[i].
   b. Check if this remaining value already exists in the HashMap.
      - If yes, return true (pair found).
   c. If not, add the current element and its index to the HashMap.
3. If no such pair is found after the loop, return false.

Time Complexity: O(n) ...Using HashMap
- We iterate through the array once, doing constant-time work (HashMap operations)
in each iteration.

Time Complexity: O(n log n) ...Using TreeMap
- TreeMap operations like containsKey() and put() take O(log n) time because TreeMap is
backed by a Red-Black Tree.
- For n elements, the total time becomes O(n log n).

Space Complexity: O(n)
- In the worst case, we may store all n elements in the Map.

Note - This is the optimal solution for type B.

===========
Optimal
===========

Two-pointer approach

1. Sort the input array in ascending order.
2. Initialize two pointers:
   - left at the beginning of the array (index 0)
   - right at the end of the array (index n - 1)
3. While left < right:
   a. Calculate the sum of the elements at left and right pointers.
   b. If the sum equals k, return true (pair found).
   c. If the sum is less than k, move the left pointer one step right to increase the sum.
   d. If the sum is greater than k, move the right pointer one step left to decrease the sum.
4. If no such pair is found after the loop, return false.


Time Complexity: O(n log n)
- Sorting the array takes O(n log n).
- The two-pointer traversal takes O(n).
- Overall: O(n log n) + O(n) = O(n log n)

Space Complexity: O(1)
- Sorting is done in-place (for primitive arrays like int[]), and only a few variables are used.


Note - This is optimal solution for type A.

This is not optimal solution for type B because with sorting original indices will get
lost. So you may need to store elements in some other data structure with a pair of value
and its index and then sort according to value. This will take O(2n) space.

 */