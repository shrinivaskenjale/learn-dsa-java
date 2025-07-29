package dsa_06_array;

public class L01_MaxMin {
    public static void main(String[] args) {
        int[] arr = {53, 234, 45, 342, 6, 134, 75};

        System.out.println("max value is: " + getMaxValue(arr));
        System.out.println("min value is: " + getMinValue(arr));
    }

    static int getMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static int getMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}

/*

Find min and max element in an array


======================
Brute force approach
======================

1. Sort the array with merge/quick sort
2. For max value, take last element at index n-1
3. For min value, take first element at index 0

Time complexity: O(n log n)


===========
Optimized
===========

1. Create a variable to track min/max value
2. Iterate over array and update the min/max value

Time complexity: O(n)

 */