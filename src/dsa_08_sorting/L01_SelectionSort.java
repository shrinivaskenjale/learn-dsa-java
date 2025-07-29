package dsa_08_sorting;


import java.util.Arrays;

public class L01_SelectionSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}

/*
https://www.geeksforgeeks.org/dsa/selection-sort-algorithm-2/

Selection Sort is named so because it repeatedly selects the smallest (or largest)
element from the unsorted part and places it in the correct position.

For each position, select the minimum element from the subarray starting at that
position to the end, and place it at the current position.

We loop from i = 0 to i < n - 1 because by the time we reach the second-last position,
the remaining element is already correctly placed — no need to find or swap it.

It's not a stable sorting algorithm.

It is an in-place sorting algorithm.

Selection sort performs n-1 passes for an array of size n, since the last element
automatically falls into place after sorting the first n-1 elements.

Time complexity: O(n^2)
Best case: O(n^2) ...sorted
Worst case: O(n^2) ...reverse sorted

Space complexity: O(1)

Applications:
1. When size of array is small.

 */