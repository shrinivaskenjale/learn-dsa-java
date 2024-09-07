package dsa_10_recursion;

import java.util.ArrayList;

// https://leetcode.com/problems/subsets/

public class L12_Subsequence {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        // find subsets from 0 to n-1 index
        findSubset(nums, 0, nums.length - 1, output, ans);

        System.out.println(ans);
    }

    static void findSubset(int[] nums, int start, int end, ArrayList<Integer> output,
            ArrayList<ArrayList<Integer>> ans) {

        // base case: size is 0
        if (start > end) {
            // as we backtrack output array changes
            // so add copy of output array in the ans
            ans.add(new ArrayList<>(output));
            return;
        }

        // exclude
        findSubset(nums, start + 1, end, output, ans);

        // include
        output.add(nums[start]);
        findSubset(nums, start + 1, end, output, ans);

        // we need to remove added item cause we are backtracking and
        // changes are made to original output array
        output.remove(output.size() - 1);
    }
}

// Subarrays vs Subsequence vs Subsets
// https://leetcode.com/discuss/study-guide/1497123/subarrays-vs-subsequence-vs-subsets#:~:text=A%20subsequence%20maintain%20relative%20ordering,contiguous%20part%20of%20an%20array.

// Set of all subsets is called power set.
// |power set| = 2^n

// Approach:
/*
 * 1. Our recursive function gives all subsets from index i to n-1.
 * 2. We ask recursive function to either include or exclude the ith item and
 * then find all subsets from i+1 to n-1.
 * 3. Base case: if size of array is 0 then subset is array with no elements.
 * Either we exclude it or include it, answer will remain same. So we will store
 * our answer in base case.
 */