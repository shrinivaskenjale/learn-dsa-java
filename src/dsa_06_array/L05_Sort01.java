package dsa_06_array;

import java.util.Arrays;

public class L05_Sort01 {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 0, 1, 1, 1, 0, 0, 1 };
        int[] arr = { 1, 1, 0, 0, 0, 0, 1, 0 };
        // =====================================
        // 2 POINTER TECHNIQUE
        // =====================================

        // [0,i) : 0
        // [i,j] : ?
        // (j,n-1] : 1

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

// For such grouping problems in arrays, use n pointer technique.