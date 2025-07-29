package dsa_06_array;

import java.util.ArrayList;
import java.util.List;

public class L13_IntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        System.out.println(intersectionBruteForce(arr1, arr2));
        System.out.println(intersectionOptimal(arr1, arr2));
    }


    public static List<Integer> intersectionBruteForce(int[] arr1, int[] arr2) {
        List<Integer> intersectionList = new ArrayList<>();
        boolean[] arr2Visited = new boolean[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !arr2Visited[j]) {
                    intersectionList.add(arr1[i]);
                    arr2Visited[j] = true;
                    break; // No point in continuing as we found the match
                } else if (arr2[j] > arr1[i]) {
                    break; // No point in continuing as next elements would be greater
                }
            }
        }

        return intersectionList;
    }

    public static List<Integer> intersectionOptimal(int[] arr1, int[] arr2) {
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersectionList;
    }
}

/*
Intersection of two sorted arrays

=============
Brute force
=============

1. Initialize:
   - An empty list called intersectionList to store the result.
   - A boolean array arr2Visited of size equal to arr2.length, initialized to false.
     → This tracks whether an element in arr2 has already been matched and used.
2. For each element in arr1 (indexed by i from 0 to arr1.length - 1):
   a. Iterate through each element in arr2 (indexed by j from 0 to arr2.length - 1):
      - If arr1[i] == arr2[j] and arr2Visited[j] is false:
          - Add arr1[i] to intersectionList.
          - Mark arr2Visited[j] = true (so it won't be reused).
          - Break from the inner loop (move to the next element in arr1).
      - Else if arr2[j] > arr1[i]:
          - Break from the inner loop early since arrays are sorted and no further matches
          are possible.
3. After both loops, return intersectionList as the final result.

Time Complexity: O(m * n)

Space Complexity: O(n + k)
- For the arr2Visited[] boolean array O(n)
- For the elements in the intersectionList O(k)


====================
Optimal
====================

1. Initialize:
   - i = 0 (pointer for arr1)
   - j = 0 (pointer for arr2)
   - An empty list called intersectionList to store the result
2. While i < length of arr1 and j < length of arr2:
   a. If arr1[i] < arr2[j], increment i
   b. Else if arr2[j] < arr1[i], increment j
   c. Else (arr1[i] == arr2[j]):
      - Add arr1[i] to intersectionList
      - Increment both i and j
3. Continue the loop until either array is fully traversed
4. Return intersectionList containing all common elements

Time Complexity: O(m + n)

Space Complexity: O(k)
k is number of common elements

To get only unique intersection values, when both are equal, add to the list only if:
(intersectionList.isEmpty() || intersectionList.getLast() != arr1[i])


 */