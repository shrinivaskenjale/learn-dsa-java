package dsa_10_recursion;

public class L02_ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6 };

        System.out.println(isSorted(arr, arr.length));
    }

    static boolean isSorted(int[] arr, int n) {
        // base case: if array size is 0 or 1 then already sorted
        if (n == 0 || n == 1) {
            return true;
        }

        // if last item of current array is smaller than previous item then array is not
        // sorted
        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }

        // array may or may not be sorted, so check for subarray
        return isSorted(arr, n - 1);
    }
}
