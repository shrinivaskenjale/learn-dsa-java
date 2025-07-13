package dsa_10_recursion;

import java.util.Arrays;

public class L10_MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 8, 5, 6, 8, 2};
        int n = arr.length;
        // sort from 0 to n-1
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        // Base case: Size of array is 0/1
        if (start >= end) {
            return;
        }

        // Find mid
        int mid = start + (end - start) / 2;

        // Sort left half
        mergeSort(arr, start, mid);

        // Sort right half
        mergeSort(arr, mid + 1, end);

        // Merge two sorted halves
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        // Merge the two halves into temp[]
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy sorted temp[] back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[start + p] = temp[p];
        }
    }
}

/*

Merge sort is a divide-and-conquer algorithm that recursively splits the array into halves,
sorts them, and then merges the sorted halves.

Space complexity: O(n)

Time complexity: O(nlog(n))

See inversion count problem

=====================
Mid calculation
=====================

❌ int mid = (start + end) / 2;
If start and end are both large integers (close to Integer.MAX_VALUE), then their sum
start + end could exceed the maximum value an int can hold, causing an overflow and
resulting in incorrect behavior.

✅ int mid = start + (end - start) / 2;
This ensures that the values stay within the valid int range.

=====================
Merge Algorithm
=====================

Time Complexity: O(n)
Space Complexity: O(n)


1. Create temp array to hold merged result.

2. Use two pointers: one for each subarray (i = left, j = mid + 1).

3. Compare elements at both pointers:
Copy the smaller one into temp[].
Move that pointer forward.

4. Copy remaining elements from left or right subarray (if any).

5. Copy temp[] back into the original array at the correct position.


 */
