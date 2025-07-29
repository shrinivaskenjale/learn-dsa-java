package dsa_06_array;

public class L09_CheckSorted {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 2, 3, 3, 4};
        int[] arr = {1, 2, 1, 3, 4};
        System.out.println(isSortedOptimal(arr));
    }

    public static boolean isSortedOptimal(int[] arr) {
        int n = arr.length;

        if (n == 1) return true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

/*
Check whether array is sorted

===========
Optimal
===========

1. Let n be the length of the array.
2. If the array has only one element, return true (a single element is always sorted).
3. Iterate from index i = 0 to n - 2:
   a. If arr[i] > arr[i + 1], the array is not sorted, return false.
4. If the loop completes without finding any out-of-order pair, return true.

Time Complexity: O(n)
- Each element is checked once.

Space Complexity: O(1)
- No extra space used.
 */