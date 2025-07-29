package dsa_06_array;

import java.util.HashMap;
import java.util.Map;

public class L20_MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};

        // System.out.println(majorityElementBruteForce(arr));
        // System.out.println(majorityElementBetter(arr));
        System.out.println(majorityElementOptimal(arr));
    }

    public static int majorityElementOptimal(int[] arr) {
        int count = 0;
        int candidate = -1;

        // Step 1: Find potential majority candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if candidate is actually the majority
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element found
        }
    }

    public static int majorityElementBetter(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static int majorityElementBruteForce(int[] arr) {
        int n = arr.length;

        for (int num : arr) {
            int count = 0;
            for (int current : arr) {
                if (current == num) count++;
            }
            if (count > n / 2) return num;
        }

        return -1;
    }
}

/*
Find the number in array of size n that appears more than n/2 times

==============
Brute Force
==============

Intuition:
Check frequency of all elements one by one.

1. Get the length of the array (n).
2. Loop through each element (num) in the array:
   a. Initialize a counter to 0.
   b. Loop through the array again and count how many times num appears.
   c. If the count is more than n / 2, return that number as the majority element.
3. If no such element is found after checking all elements, return -1.

Time Complexity: O(n^2)

Space Complexity: O(1)


============
Better
============

Intuition:
Find frequencies of all numbers. Then find the number whose frequency is more than n/2.

1. Let n be the length of the input list.
2. Create an empty map to store the count of each number.
3. Go through each number in the list:
   a. Increase its count in the map.
4. Go through the map entries:
   a. If any number has a count greater than n / 2, return that number.
5. If no number has a count greater than n / 2, return -1.


Time Complexity: O(n)
- Finding frequency using HashMap takes O(n)
- Iterating over map takes O(n)
- If TreeMap is used instead: O(n log n)

Space Complexity: O(n)

==============
Optimal
==============

Moore’s Voting Algorithm

- It works only if there is guaranteed to be a majority element.
- If not guaranteed, an extra pass is needed to confirm that the candidate actually
occurs more than n/2 times.

1. Initialize count = 0 and candidate = None.
2. Traverse the list:
   a. If count is 0, set candidate to the current number.
   b. If the current number is equal to candidate, increment count.
   c. Else, decrement count.
3. After traversal, candidate is the potential majority element.
4. (Optional) Traverse again to verify if the candidate appears more than n / 2 times.


Time Complexity: O(n)
- Only two passes through the array (or one if majority is guaranteed).

Space Complexity: O(1)
- Only two variables used, regardless of input size.

Intuition:
- Imagine every number in the array is a voter.
- We keep a running "candidate" and a "vote count".
- If the current number matches the candidate, it's a vote in support → increase count.
- If it doesn't match, it's a vote against → decrease count.
- When the count drops to 0, we switch the candidate to the current number.
- The majority element appears more than n/2 times. So even after canceling out opposing
votes, the majority will survive till the end.
- A second pass is needed to verify that the final candidate actually occurs more than
n/2 times, in case no majority element exists.


 */