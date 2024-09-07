package dsa_10_recursion;

import java.util.Arrays;

public class L08_SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 43, 2, 2 };
        selectionSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int start, int end) {
        // if array size is 0/1 then already sorted
        if (start >= end) {
            return;
        }

        // we will try to put smallest item in first position and ask recursive function
        // to sort rest of the array
        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        selectionSort(arr, start + 1, end);

    }
}
