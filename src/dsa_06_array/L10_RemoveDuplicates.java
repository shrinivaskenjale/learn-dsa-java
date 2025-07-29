package dsa_06_array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class L10_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        // int[] arr = {1, 2, 3};

        // removeDuplicatesBruteForce(arr);
        removeDuplicatesOptimal(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void removeDuplicatesBruteForce(int[] arr) {
        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int nextUniqueIndex = 0;
        for (int num : set) {
            arr[nextUniqueIndex++] = num;
        }
    }

    public static void removeDuplicatesOptimal(int[] arr) {
        int n = arr.length;
        int nextUniqueIndex = 0;
        int lastUniqueElement = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != lastUniqueElement) {
                arr[nextUniqueIndex] = arr[i];
                lastUniqueElement = arr[i];
                nextUniqueIndex++;
            }
        }
    }
}

/*

Remove duplicates from a sorted array.
If there are k unique elements, place them in original order from index 0 to k-1.
The remaining elements (from index k to n - 1) can be ignored and can contain any value.

===============
Brute force
===============

1. Create a TreeSet
2. Iterate on the array and add all elements of array into TreeSet
3. Iterate on the set and start putting set elements into the array from index 0

Time complexity: O(n log n)
Inserting n elements in TreeSet takes O(n log n)
Putting set elements back into array takes O(n)

Space complexity: O(n)
- In worst case all elements are unique and need to be inserted in set

==============
Optimal
==============

1. Let n be the length of the array.
2. Initialize:
   - nextUniqueIndex = 0 → position where the next unique element should be placed
   - lastUniqueElement = -1 (or a value outside input range) → tracks the last unique
   element encountered
3. Iterate through the array from index i = 0 to n - 1:
   a. If arr[i] is not equal to lastUniqueElement:
      - Place arr[i] at arr[nextUniqueIndex]
      - Update lastUniqueElement to arr[i]
      - Increment nextUniqueIndex by 1
4. After the loop ends, the first nextUniqueIndex elements of arr[] will contain the unique
elements in sorted order.
5. The elements from index nextUniqueIndex to n - 1 can be ignored.

Time complexity: O(n)

Space complexity: O(1)


 */