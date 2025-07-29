package dsa_08_sorting;

import java.util.Arrays;

public class L05_QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 4, 3, 2, 1};
        int n = arr.length;
        // Sort from 0 to n-1
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        // Base case: Size of array is 0/1
        if (start >= end) {
            return;
        }

        // Partition the array and get pivot index
        int pivotIndex = partition(arr, start, end);

        // Sort left half
        quickSort(arr, start, pivotIndex - 1);
        // Sort right half
        quickSort(arr, pivotIndex + 1, end);

    }

    public static int partition(int[] arr, int start, int end) {
        // Pick pivot: Last element
        int pivot = arr[end];
        // j keeps track of where the next smaller-or-equal element should go.
        int j = start;

        // Iterate over elements of array except pivot
        for (int i = start; i < end; i++) {
            // If element <= pivot is found, swap it with element at index j
            if (arr[i] <= pivot) {
                swap(arr, j, i);
                j++;
            }
        }

        // Place pivot in correct position
        swap(arr, j, end);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*

Quick sort is a divide-and-conquer algorithm that partitions the array around a pivot,
placing smaller elements on one side and larger on the other, then recursively sorts
the partitions.

Space complexity: ?

Time complexity: ?

======================
Partition Algorithm
======================

The partition algorithm rearranges elements in an array so that all elements less than or
equal to the pivot come before it, and all elements greater than the pivot come after,
placing the pivot in its correct sorted position.

Time Complexity: O(n)
Space Complexity: O(1)


1. Choose pivot as the last element: pivot = arr[end].

2. Initialize j = start to track the position for the next element ≤ pivot.

3. Loop i from start to end - 1:
    - If arr[i] ≤ pivot:
        - Swap arr[i] with arr[j].
        - Increment j.
Note - Don't iterate on the pivot index; process it after the loop.

4. After the loop, swap arr[j] with arr[end] to place the pivot in its correct position.

5. Return j as the pivot’s final index.

 */

