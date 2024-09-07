package dsa_05_sorting;

import java.util.*;

// https://www.codingninjas.com/codestudio/problems/selection-sort_981162

public class L01_SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 4, 2, 7, 2, 9, 1 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // find minimum number's index in subarray [i,n-1]
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the values of i and minIndex
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}

// Iterate over each position and place minimum value at that position from
// subarray from that position to end of the array.

// Not stable
// In place: It is an in-place sorting algorithm, which modifies the original
// array's elements to sort the given array.

// Total rounds = n-1 ...(last position is automatically sorted)

// Space complexity = O(1)

// Time complexity = O(n^2)
// n-1, n-2, n-3, ....,1 => n(n-1)/2 => (n^2 - n)/2 => O(n^2)
// Best case = O(n^2) ...sorted
// Worst case = O(n^2) ...reverse sorted

// Applications:
// 1. When size of array is small.