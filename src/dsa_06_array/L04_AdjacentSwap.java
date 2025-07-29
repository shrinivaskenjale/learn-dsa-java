package dsa_06_array;

import java.util.Arrays;

public class L04_AdjacentSwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // {2,1,4,3,6,5,7}
        swapAdjacent(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapAdjacent(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}

/*
Given an array of integers, swap every two adjacent elements in place.
If the array has an odd number of elements, leave the last element as it is.
 */