package dsa_04_binary_search;

public class L02_PivotElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 9, 1 };

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }

        System.out.println(start);
    }

}

// Find pivot element in sorted then rotated array.
// Pivot element is smallest element in sorted rotated array.
// In {7,9,1,2,3}, 1 is the pivot element.
// Draw lines to understand the logic

// while start<end:
// 1. if arr[mid]>=arr[0] means mid lies on first half.
// We find on right half

// 2. else mid lies on second half and mid could be pivot as well.
// We find on left half but including mid element.

// answer is start/end/mid
