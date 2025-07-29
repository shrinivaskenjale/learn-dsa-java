package dsa_06_array;

public class L15_MaxConsecutive1s {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(getMaxConsecutiveOnesOptimal(arr));
    }

    public static int getMaxConsecutiveOnesOptimal(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        return max;
    }
}

/*
Find max no. of consecutive 1s in given array

===============
Optimal
===============

1. Initialize two counters: count (for current streak) and max (for maximum streak).
2. Traverse the array:
   - If the current element is 1, increment count and update max if needed.
   - If the current element is 0, reset count to 0.
3. After the loop, return max as the longest sequence of 1s.


Time Complexity: O(n)

Space Complexity: O(1)

 */