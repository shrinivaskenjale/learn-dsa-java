package dsa_08_sorting;


import java.util.Arrays;

public class L02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if no swaps were made (already sorted)
            if (!swapped) break;
        }
    }
}

/*
https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/

Bubble Sort is named so because larger elements "bubble up" to the end of the array
with each pass through adjacent swaps.

It's a stable sorting algorithm.

It is an in-place sorting algorithm.

Bubble sort makes n-1 passes in the worst case for an array of size n.

If no swap is performed during a pass, the array is already sorted — this can be used as
an optimization.

Time complexity: O(n^2)
Best case: O(n) ...sorted (at least 1 round needs to be performed)
Worst case: O(n^2) ...reverse sorted

Space complexity: O(1)

Applications:
1. We place kth largest element at right position.
 */












