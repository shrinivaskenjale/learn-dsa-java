package dsa_00_practice;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 5, 2, 3, 0};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void solve(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*

a^b = (a^2)^b/2
a^b = (a^2)^b/2 * a

 */