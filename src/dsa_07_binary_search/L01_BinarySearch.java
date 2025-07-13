package dsa_07_binary_search;

public class L01_BinarySearch {

    // O(log n)
    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == key) {
                // found
                return mid;
            } else if (key > arr[mid]) {
                // right part
                start = mid + 1;
            } else {
                // left part
                end = mid - 1;
            }

            // update mid
            mid = start + (end - start) / 2;
        }

        // not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 1));
    }
}

// Time complexity: O(log(n))
// n => n/2 => n/4 .... => n/2^k
// n/2^k=1
// 2^k=n
// k=log(n) ...(base 2)

// https://www.geeksforgeeks.org/binary-search/
// https://www.geeksforgeeks.org/binary-search-in-java/

// Elements should be in sorted order.

// [low,high] is our search range

// Our condition is low<=high

// First we need to find mid element
// int mid = low + (high – low)/2;

// Compare key with mid value
// if equal then we found answer and we stop our search
// else if key is greater than mid then continue search in right half
// else search in left half