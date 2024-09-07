package dsa_10_recursion;

import java.util.Arrays;

public class L10_MergeSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 2, 8, 5, 6, 8, 2 };
        int n = arr.length;
        // sort from 0 to n-1
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        // base case: size of array is 0/1
        if (start >= end) {
            return;
        }

        // find mid
        int mid = start + (end - start) / 2;

        // sort left half and right half
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        // now merge two sorted halves
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        // first create two arrays representing left and right half
        int len1 = mid - start + 1;
        int len2 = end - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        for (int i = 0; i < len1; i++) {
            first[i] = arr[start + i];
        }

        for (int j = 0; j < len2; j++) {
            second[j] = arr[mid + 1 + j];
        }

        // now merge 2 sorted arrays
        int i = 0;
        int j = 0;
        int k = start;

        while (i < len1 && j < len2) {
            if (first[i] < second[j]) {
                arr[k] = first[i];
                i++;
                k++;
            } else {
                arr[k] = second[j];
                j++;
                k++;
            }
        }

        while (i < len1) {
            arr[k] = first[i];
            i++;
            k++;
        }

        while (j < len2) {
            arr[k] = second[j];
            j++;
            k++;
        }
    }
}

// Time complexity: O(nlog(n))
// Space complexity: O(n)

// Read this
// https://www.geeksforgeeks.org/merge-sort/

// See inversion count problem