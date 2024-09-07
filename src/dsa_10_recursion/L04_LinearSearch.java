package dsa_10_recursion;

public class L04_LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 2, 8, 4 };
        System.out.println(linearSearch(arr, arr.length, -4));
    }

    static int linearSearch(int[] arr, int n, int key) {
        // base case: array is empty then key will not be present
        if (n == 0) {
            return -1;
        }

        // compare key with last item of current subarray
        if (arr[n - 1] == key) {
            return n - 1;
        }
        // if not found then search in remaining subarray
        return linearSearch(arr, n - 1, key);
    }
}
