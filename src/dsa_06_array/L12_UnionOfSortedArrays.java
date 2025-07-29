package dsa_06_array;

import java.util.ArrayList;
import java.util.List;

public class L12_UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        System.out.println(unionOptimal(arr1, arr2));
    }

    public static List<Integer> unionOptimal(int[] arr1, int[] arr2) {
        List<Integer> unionList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (unionList.isEmpty() || unionList.getLast() != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
            } else {
                if (unionList.isEmpty() || unionList.getLast() != arr2[j]) {
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (unionList.isEmpty() || unionList.getLast() != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (unionList.isEmpty() || unionList.getLast() != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;

        }

        return unionList;
    }
}


/*

Union of two sorted arrays

=============
Brute force
=============

1. Create a empty TreeSet
2. Iterate on first array and add elements in set
3. Iterate on second array and add elements in set
4. Create an array of size equal to size of the set for storing union
5. Iterate on set and add elements in union array

Time complexity: O((m+n)log(m+n))
Inserting n elements from first array into set: O(m log m)
Inserting m elements from second array into set: O(n log (m+n))
Populating union array: O(m+n)

Space complexity: O(m+n)


====================
Optimal
====================

Logic is similar to merge algorithm from merge sort.

1. Initialize two pointers:
   - i = 0 (for arr1)
   - j = 0 (for arr2)
2. Initialize an empty list called unionList to store the result.
3. While both i < length of arr1 and j < length of arr2:
   a. If arr1[i] <= arr2[j]:
      - If unionList is empty OR last element in unionList is not equal to arr1[i]:
          - Add arr1[i] to unionList.
      - Increment i by 1.
   b. Else:
      - If unionList is empty OR last element in unionList is not equal to arr2[j]:
          - Add arr2[j] to unionList.
      - Increment j by 1.
4. After the main loop, handle any remaining elements in arr1:
   - For each remaining arr1[i]:
     - If unionList is empty OR last element in unionList is not equal to arr1[i]:
         - Add arr1[i] to unionList.
     - Increment i.
5. Similarly, handle any remaining elements in arr2:
   - For each remaining arr2[j]:
     - If unionList is empty OR last element in unionList is not equal to arr2[j]:
         - Add arr2[j] to unionList.
     - Increment j.
6. Return unionList as the final result.


Time complexity: O(m + n)
Visiting element in each array exactly once.
m = length of arr1
n = length of arr2

Space Complexity: O(m + n)
- In the worst case, if all elements are unique.
 */