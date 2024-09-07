package dsa_03_array;

import java.util.Arrays;

public class L07_RotateArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        rightRotate(a, 2);
        System.out.println("right rotate: " + Arrays.toString(a));

        int[] b = { 1, 2, 3, 4, 5, 6 };
        leftRotate(b, 8); // equal to 2
        System.out.println("left rotate: " + Arrays.toString(b));
    }

    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// Right rotate array k times => put last k items in the beginning
// Left rotate array k times => put first k items in the last

// Basic approach 1:
// E.g., right rotate k times
// For k times perform rotate right operation:
// 1. store last item in temporary variable
// 2. shift all other items to right one place
// 3. put temporary value in first place

// Basic approach 2:
// create new array of same size
// iterate over original array
// place current item in (i+k)%n index in new array

// Optimized approach: Reversal Algo.

// A. Right rotate k times:
// 1. reverse last k items
// 2. reverse rest of the items
// 3. reverse whole array

// B. Left rotate k times:
// 1. reverse first k items
// 2. reverse rest of the items
// 3. reverse whole array

// if k>=n => k=k%n