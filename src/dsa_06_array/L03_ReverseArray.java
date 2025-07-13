package dsa_06_array;

import java.util.Arrays;

public class L03_ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // reverse the array
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swapping arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// 2 Pointer technique
// We don't need once swapped value again.