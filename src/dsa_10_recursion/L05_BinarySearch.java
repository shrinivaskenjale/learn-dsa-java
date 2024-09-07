package dsa_10_recursion;

public class L05_BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int key = 15;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(arr, start, end, key));
    }

    static int binarySearch(int[] arr, int start, int end, int key) {
        // base case: size of array is zero
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            // key found
            return mid;
        } else if (key < arr[mid]) {
            // search in left half
            return binarySearch(arr, start, mid - 1, key);
        } else {
            // search in right half
            return binarySearch(arr, mid + 1, end, key);
        }

    }
}
