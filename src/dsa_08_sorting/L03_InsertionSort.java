package dsa_08_sorting;


import java.util.Arrays;

public class L03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to insert
            int j = i - 1;

            // Shift elements of arr[0..i-1] greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key in its correct position
            arr[j + 1] = key;
        }
    }

}

/*
Insertion Sort is named so because it builds the sorted array one element at a time by
inserting each element into its correct position.

Remember card example. You are given card one by one, you insert them in sorted order
as you get one. You keep sorted cards in left hand and unknown cards in right hand.

It's a stable sorting algorithm.

It is an in-place sorting algorithm.

Insertion sort makes n-1 passes for an array of size n, as it starts inserting from the
second element onward.

Space complexity: O(1)

Time complexity: O(n^2)
Best case = O(n) ...sorted (at least 1 comparison is performed for each element)
Worst case = O(n^2) ...reverse sorted

Applications:
1. When size of array is small.
2. When array is partially sorted as it is a ADAPTIVE ALGORITHM.
 */







