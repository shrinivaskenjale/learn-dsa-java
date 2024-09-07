package dsa_05_sorting;

import java.util.*;

// https://www.codingninjas.com/codestudio/problems/insertion-sort_3155179?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2

public class L03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 3, 4, 2, 3, 7, 2 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}

// Remember card example. You are given card one by one, you insert them in
// sorted order as you get one. You keep sorted cards in left hand and unknown
// cards in right hand.

// We iterate over array. We place current element in already sorted left
// subarray. We shift all greater numbers than current element to right.
// Then place current value at empty slot.
// Array is sorted in range [0,i)

// Stable
// In place

// Total rounds = n-1 ...(first position is initially sorted)

// Space complexity = O(1)

// Time complexity = O(n^2)
// 1,2,3...n-1 => n(n-1)/2 => (n^2 - n)/2 => O(n^2)
// Best case = O(n) ...sorted (at least 1 comparison is performed for each
// element)
// Worst case = O(n^2) ...reverse sorted

// Applications:
// 1. When size of array is small.
// 2. When array is partially sorted as it is a ADAPTIVE ALGORITHM.