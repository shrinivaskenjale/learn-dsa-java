package dsa_10_recursion;

import java.util.Arrays;

public class L11_QuickSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 4, 3, 2, 1 };
        int n = arr.length;
        // sort from 0 to n-1
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        // base case: if size is 0/1
        if (start >= end) {
            return;
        }

        // find index of pivot after partition
        int pivotIndex = partition(arr, start, end);

        // now sort left and right half
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);

    }

    static int partition(int[] arr, int start, int end) {
        // [start,i) = smaller/equal
        // [i,j] = ?
        // (j,end-1] = greater

        int pivotValue = arr[end];
        int i = start;
        int j = end - 1;
        while (i <= j) {
            if (arr[i] > pivotValue) {
                swap(arr, i, j);
                j--;
            } else {
                i++;
            }
        }

        // now i is at right position
        swap(arr, i, end);

        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Idea here is to place pivot element at its right position such that all
// elements on its left are smaller and all elements on its right are greater
// than pivot.
// Then we call recursive function to sort left half and right half.

// Read this
// https://www.geeksforgeeks.org/quick-sort/