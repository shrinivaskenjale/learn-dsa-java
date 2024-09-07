package dsa_10_recursion;

import java.util.Arrays;

public class L07_BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 43, 2, 2 };
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n) {
        // base case: if size is 0/1 then already sorted
        if (n == 0 || n == 1) {
            return;
        }

        // We will place greatest element at its position and ask bubbleSort function to
        // sort subarray of size n-1 for us.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);
    }
}
