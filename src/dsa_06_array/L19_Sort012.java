package dsa_06_array;

import java.util.Arrays;

public class L19_Sort012 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 1, 1, 0, 2, 1, 0};

        // sort012Better(arr);
        sort012Optimal(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort012Better(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int i = 0;

        while (count0 != 0) {
            arr[i] = 0;
            i++;
            count0--;
        }

        while (count1 != 0) {
            arr[i] = 1;
            i++;
            count1--;
        }

        while (count2 != 0) {
            arr[i] = 2;
            i++;
            count2--;
        }
    }

    public static void sort012Optimal(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*

Sort the array containing only 0s, 1s and 2s

==============
Brute Force
==============

Sort the array with merge sort or quick sort.

Time Complexity: O(n log n)

Space Complexity: O(n)

================
Better
================

Counting Sort approach

1. Initialize three counters: count0, count1, and count2 to 0.
2. Traverse the array once and count the number of 0s, 1s, and 2s.
   - Increment the corresponding counter based on the value of each element.
3. Overwrite the original array:
   a. Fill the first count0 positions with 0s.
   b. Then fill the next count1 positions with 1s.
   c. Finally, fill the remaining count2 positions with 2s.
4. The array will be sorted in-place in the order: all 0s, followed by 1s, then 2s.

Time Complexity: O(n)
- The array is traversed twice:
  1. Once for counting 0s, 1s, and 2s → O(n)
  2. Once for overwriting values based on counts → O(n)
- Total time: O(n) + O(n) = O(n)

Space Complexity: O(1)


==========
Optimal
==========

Dutch National Flag Algorithm

Using 3 pointers, we divide array in 4 parts:
1. 0 to low-1 => 0s
2. low to mid-1 => 1s
3. mid to high => Unknown
4. high+1 to end => 2s

1. Initialize three pointers:
   - low = 0 (tracks the end of 0s section)
   - mid = 0 (current element being processed)
   - high = n - 1 (tracks the start of 2s section)
2. Loop while mid <= high:
   a. If arr[mid] == 0:
      - Swap arr[mid] with arr[low]
      - Increment both low and mid
   b. If arr[mid] == 1:
      - Just increment mid (1 is already in correct section)
   c. If arr[mid] == 2:
      - Swap arr[mid] with arr[high]
      - Decrement high (but don’t increment mid, as the swapped value at mid must be checked)
3. Loop ends when mid crosses high, and the array is sorted in-place as [0s][1s][2s].




Time Complexity: O(n)
- Each element is processed at most once (in a single while loop).

Space Complexity: O(1)

 */