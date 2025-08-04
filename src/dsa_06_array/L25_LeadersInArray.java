package dsa_06_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L25_LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6, 6};
        System.out.println(getLeadersBruteForce(arr));
        System.out.println(getLeadersOptimal(arr));
    }

    public static List<Integer> getLeadersBruteForce(int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int candidate = arr[i];
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > candidate) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(candidate);
            }
        }

        return leaders;
    }

    public static List<Integer> getLeadersOptimal(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        List<Integer> leaders = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                leaders.add(arr[i]);
                maxSoFar = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}

/*
Given an array arr[] of size n, a leader is an element that is greater than or equal to
all elements to its right.

Your task is to find all the leaders in the array and return them in the order they appear
from left to right in the original array.

Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]

================
Brute Force
================

Intuition:
For each element, check all elements to its right — if none are greater, it's a leader.

1. Initialize an empty list to store leaders.
2. Loop through the array from left to right:
   a. For each element at index i, assume it is a leader.
   b. Compare it with every element to its right (from i+1 to end).
   c. If any element to the right is greater than the current element,
      it is not a leader. Break out of the inner loop.
   d. If no greater element is found, add it to the list of leaders.
3. Return the list of leaders.

Time Complexity: O(n²)

Space Complexity: O(k)
- Here k is the number of leaders


===========
Optimal
===========

Intuition:
- Traverse from right to left, keeping track of the maximum seen so far.
- Any element ≥ max is a leader.

1. Initialize an empty list to store leaders.
2. Initialize a variable maxSoFar with the smallest possible integer value.
3. Traverse the array from right to left:
   a. For each element, check if it is greater than or equal to maxSoFar.
   b. If yes, it is a leader:
      - Add it to the list.
      - Update maxSoFar with this element.
   c. If not, continue to the next element.
4. After the loop, reverse the list to restore the left-to-right order.
5. Return the list of leaders.

Time Complexity: O(n)
- Single pass and one reversal.

Space Complexity: O(k)
- Here k is the number of leaders.

 */