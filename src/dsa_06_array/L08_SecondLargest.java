package dsa_06_array;

public class L08_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.println(findSecondLargestOptimal(arr));
    }

    public static int findSecondLargestOptimal(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }
}

/*
Find second-largest element in an array

=============
Brute force
=============

1. Sort the array with merge/quick sort
2. Consider last element at index n-1 as the largest element
3. Start iterating from n-2 to 0, and find first element that is not equal to the
largest element

Time complexity: O(n log n)
- Sorting takes O(n log n)
- In worst case iterating will take O(n)

Space Complexity: O(1)

====================
Better
====================

1. Iterate over array and find the largest element
2. Iterate second time over array and find the largest element that is not equal to the
largest element from last iteration

Time complexity: O(n)
- First iteration takes O(n)
- Second iteration takes O(n)

Space Complexity: O(1)

=============
Optimal
=============

1. If the array has fewer than 2 elements, return -1 (not enough elements).
2. Initialize two variables:
   - largest = smallest possible integer
   - secondLargest = smallest possible integer
3. Iterate through each element 'num' in the array:
   a. If num > largest:
      - Set secondLargest = largest
      - Set largest = num
   b. Else if num > secondLargest and num < largest:
      - Set secondLargest = num
4. After loop ends, if secondLargest is still the smallest possible integer (no second largest found), return -1.
5. Otherwise, return secondLargest.

Time complexity: O(n)

Space Complexity: O(1)

 */