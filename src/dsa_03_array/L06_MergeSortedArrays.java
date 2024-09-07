package dsa_03_array;

import java.util.Arrays;

public class L06_MergeSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = { 1, 3, 5, 7 };
        int[] nums2 = { 2, 4, 6 };

        // solution array with size equal to sum of sizes of both arrays
        int[] ans = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                ans[k] = nums1[i];
                k++;
                i++;
            } else {
                ans[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < nums1.length) {
            ans[k] = nums1[i];
            k++;
            i++;
        }

        while (j < nums2.length) {
            ans[k] = nums2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(ans));
    }
}

// 2 pointer technique
// We don't need to worry about once placed values again.

// We scan both arrays left to right, compare current values and put smaller
// value in solution array. And then update pointers.

// It may happen that, all values from one array are scanned but values in other
// arrays are remaining. In that case we put that array's values at the end of
// solution array.