package dsa_10_recursion;

import java.util.Arrays;

public class L09_InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 43, 2, 2 };
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr, int n) {
        // base case: if size is 0/1 then sorted
        if (n == 0 || n == 1) {
            return;
        }

        // idea of insertion sort is that we place current item in already sorted array
        // so, first we will sort array of size n-1 and place nth item in right place

        insertionSort(arr, n - 1);
        int key = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > key) {
            // shift right 1 index
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
