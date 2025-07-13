package dsa_05_frequency;

public class L01_FrequencyArray {
    public static void main(String[] args) {
        // ===========
        // Integers
        // ===========

        int[] freqA = new int[1001];  // To store frequencies from 0 to 1000
        int[] nums = {3, 4, 5, 3, 3, 4};

        for (int num : nums) {
            freqA[num]++;
        }

        System.out.println(freqA[3]); // prints 3
        System.out.println(freqA[4]); // prints 2
        System.out.println(freqA[5]); // prints 1

        // =======================
        // Lowercase Letters
        // =======================

        int[] freqB = new int[26];  // For 'a' to 'z'

        String s1 = "banana";
        for (char ch : s1.toCharArray()) {
            freqB[ch - 'a']++;  // map 'a' to index 0, 'b' to 1, ..., 'z' to 25
        }

        System.out.println(freqB['a' - 'a']); // prints 3
        System.out.println(freqB['b' - 'a']); // prints 1
        System.out.println(freqB['n' - 'a']); // prints 2

        // =======================
        // Uppercase Letters
        // =======================

        int[] freqC = new int[26];  // For 'A' to 'Z'

        String s2 = "BANANA";
        for (char ch : s2.toCharArray()) {
            freqC[ch - 'A']++;  // map 'A' to index 0, 'B' to 1, ..., 'Z' to 25
        }

        System.out.println(freqC['A' - 'A']); // prints 3
        System.out.println(freqC['B' - 'A']); // prints 1
        System.out.println(freqC['N' - 'A']); // prints 2

        // ========================================
        // Both Uppercase and Lowercase Letters
        // ========================================

        int[] freqD = new int[52];  // 26 lowercase + 26 uppercase

        String s3 = "BAnanA";

        for (char ch : s3.toCharArray()) {
            if (Character.isLowerCase(ch))
                freqD[ch - 'a']++;
            else if (Character.isUpperCase(ch))
                freqD[26 + (ch - 'A')]++;
        }

        // ======================
        // ASCII Characters
        // ======================

        int[] freqE = new int[128];  // Standard ASCII range

        for (char ch : s3.toCharArray()) {
            freqE[ch]++;
        }

        // ====================
        // Unicode characters
        // ====================

        // Use a Map<Character, Integer> instead, because Unicode range is very large.

    }
}

/*

A frequency array is an array where each index represents a unique value from the input,
and the value at that index stores how many times it appears.

If the size of the frequency array is n, then it can store the frequencies of n distinct
values, each mapped to a unique index from 0 to n-1.

If your max index is ≤ 10⁷, frequency arrays are fine.

 */
