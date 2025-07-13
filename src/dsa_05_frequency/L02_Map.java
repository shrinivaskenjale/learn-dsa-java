package dsa_05_frequency;

import java.util.*;

public class L02_Map {
    public static void main(String[] args) {
        int[] nums = {3, 4, 3, 2, 5, 3, 4};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Get frequency
        System.out.println(freqMap.getOrDefault(3, 0));
        System.out.println(freqMap.getOrDefault(4, 0));

        // Iterate on values and their frequencies
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " appears " + entry.getValue() + " times.");
        }
    }
}

/*

Use HashMap for fast key-value access when ordering doesn't matter.

Use TreeMap when you need keys in sorted order or require range-based operations.

 */