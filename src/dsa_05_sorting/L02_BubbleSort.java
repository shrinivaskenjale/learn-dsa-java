package dsa_05_sorting;

import java.util.*;

// https://www.codingninjas.com/codestudio/problems/bubble-sort_980524?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2

public class L02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 3, 4, 2, 3, 7, 2 };
        int n = arr.length;

        // move j upto i to compare j with j+1
        for (int i = n - 2; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

// Iterate over subarray (0,i) to place maximum element at last position in each
// iteration. Compare current element with next element, swap if required.
// round 1: [0,n-1)
// round 2: [0,n-2)
// round 3: [0,n-3)
// round i: [0,n-i)

// If in some round there is no swap performed then array is sorted. This can be
// used for optimization.

// Stable
// In place

// Total rounds = n-1 ...(first position is automatically sorted)

// Space complexity = O(1)

// Time complexity = O(n^2)
// n-1, n-2, n-3, ....,1 => n(n-1)/2 => (n^2 - n)/2 => O(n^2)
// Best case = O(n) ...sorted (at least 1 round needs to be performed)
// Worst case = O(n^2) ...reverse sorted

// Applications:
// 1. We place kth largest element at right position.