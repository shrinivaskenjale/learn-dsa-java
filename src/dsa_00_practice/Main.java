package dsa_00_practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 2, 4, 2, 6, 1};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void solve(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }
}

/*
 */