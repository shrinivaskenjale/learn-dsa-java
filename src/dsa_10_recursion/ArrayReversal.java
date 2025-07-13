package dsa_10_recursion;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Reverse array from start to end index
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

        // Reverse given array of size n
        reverse(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    // Time: O(n)
    // Space: O(n)
    public static void reverse(int[] arr, int start, int end) {
        // If array of size 1 or invalid size, return
        if (start >= end) {
            return;
        }

        // Swap the start and end elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Ask recursion to reverse middle portion of array
        reverse(arr, start + 1, end - 1);
    }

    // Time: O(n^2)
    // Space: O(n)
    public static void reverse(int[] arr, int n) {
        // If array size is 1 or less, return
        if (n <= 1) return;

        // Ask recursion to reverse array of size n-1
        reverse(arr, n - 1);

        // Put the last element at very beginning of reversed array of size n-1
        // For this, shift all elements to right by 1 place
        int lastElement = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = lastElement;
    }
}
