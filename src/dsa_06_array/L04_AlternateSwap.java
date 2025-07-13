package dsa_06_array;

import java.util.Arrays;

public class L04_AlternateSwap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 }; // {2,1,4,3,6,5,7}
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));
    }

    // swaps alternate nos.
    static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
