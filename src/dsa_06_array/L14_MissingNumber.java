package dsa_06_array;

public class L14_MissingNumber {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 5};

        // System.out.println(findMissingBruteForce(n, arr));
        // System.out.println(findMissingBetter(n, arr));
        // System.out.println(findMissingOptimal1(n, arr));
        System.out.println(findMissingOptimal2(n, arr));
    }

    public static int findMissingOptimal1(int n, int[] arr) {
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        int nSum = n * (n + 1) / 2;

        return nSum - arraySum;
    }

    public static int findMissingOptimal2(int n, int[] arr) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        for (int num : arr) {
            xor2 = xor2 ^ num;
        }

        return xor1 ^ xor2;
    }

    public static int findMissingBruteForce(int n, int[] arr) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1;
    }

    public static int findMissingBetter(int n, int[] arr) {
        int[] freq = new int[n + 1];
        for (int num : arr) {
            freq[num] += 1;
        }

        for (int num = 1; num <= n; num++) {
            if (freq[num] == 0) return num;
        }

        return -1;
    }
}

/*
For given n, array of size n-1 is given.
Array contains unique elements between 1 to n.
Find the missing number.

================
Brute Force
================

1. Loop through all numbers i from 1 to n:
   a. Initialize a boolean flag 'found' as false
   b. For each element 'num' in the array:
      - If num equals i:
         - Set found to true
         - Break the inner loop
   c. After the inner loop, if found is still false:
      - Return i as the missing number
2. If all numbers from 1 to n are present, return -1 (should not happen in a valid input)

Time Complexity: O(n^2)

Space Complexity: O(1)

================
Better
================

1. Create an integer array 'freq' of size n + 1 and initialize all elements to 0
   - This array will track the frequency of each number from 1 to n
2. For each number 'num' in the input array:
   - Increment freq[num] by 1
3. Loop through numbers from 1 to n:
   - If freq[num] is 0, that means the number 'num' is missing
   - Return that number
4. If no number is missing (which shouldn't happen in valid input), return -1

Time Complexity: O(n)
- One pass to fill the frequency array: O(n)
- One pass to find the missing number: O(n)

Space Complexity: O(n)
- Uses an extra array of size n + 1 to store frequency

====================
Optimal 1
====================

1. Initialize a variable arraySum = 0
2. Loop through each number 'num' in the array:
   - Add num to arraySum
3. Calculate the expected sum of numbers from 1 to n using the formula:
   - nSum = n * (n + 1) / 2
4. The missing number is the difference:
   - Return nSum - arraySum

Time Complexity: O(n)

Space Complexity: O(1)

=================
Optimal 2
=================

1. Initialize two variables:
   - xor1 = 0 (to store XOR of all numbers from 1 to n)
   - xor2 = 0 (to store XOR of all elements in the input array)
2. Loop from i = 1 to n:
   - xor1 = xor1 XOR i
3. Loop through each number 'num' in the array:
   - xor2 = xor2 XOR num
4. The missing number is the XOR of xor1 and xor2:
   - Return xor1 XOR xor2

Explanation:
- XOR of a number with itself is 0 (e.g., x ^ x = 0).
- XOR of a number with 0 is the number itself (e.g., x ^ 0 = x).
- When we XOR all numbers from 1 to n and all elements in the array,
  all the common elements cancel out, and we're left with the missing number.

Time Complexity: O(n)

Space Complexity: O(1)



 */