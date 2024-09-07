package dsa_10_recursion;

import java.util.*;

// https://leetcode.com/problems/permutations/

// Given an array, find all permutations of it.

public class L13_Permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // find permutations from 0 to n-1
        find(arr, 0, arr.length - 1, ans);

        System.out.println(ans);
    }

    static void find(int[] arr, int start, int end, ArrayList<ArrayList<Integer>> ans) {
        // base case: length is 0
        if (start > end) {
            ArrayList<Integer> output = new ArrayList<>();
            for (int i : arr) {
                output.add(i);
            }
            ans.add(output);
            return;
        }

        // possible values at start are >=start
        for (int i = start; i <= end; i++) {
            swap(arr, start, i);
            // find permutations of array [start+1, end]
            find(arr, start + 1, end, ans);
            // when we backtrack we have to revert the changes
            swap(arr, start, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
// if size of input is n then total permutations are n!

// Backtracking
// Approach:
/*
 * suppose arr={1,2,3}
 * We call function to find permutations of 0 to n-1
 * 
 * For any given substring from i to n-1, first position of this substring's
 * permutation can be taken by all the items >=i
 * E.g., if i=0 => 1/2/3
 * 
 * So, what we do is, for each value >=i, swap with first value(ith) and
 * recursively find permutations of rest of the values from i+1 to n-1
 * 
 * Base case: when length of array is 0, do nothing and store answer.
 */