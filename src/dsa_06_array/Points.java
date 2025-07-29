package dsa_06_array;

public class Points {

}

/*
An array is a fixed-size, ordered collection of elements of the same type stored in
contiguous memory locations.

In Java, the maximum size of an array is Integer.MAX_VALUE (i.e., 2,147,483,647), but
practically it's slightly less due to JVM overhead and available memory.

A subarray is a contiguous part of an array that maintains the original order of elements.

A subsequence is a sequence derived from an array by deleting zero or more elements without changing the order of the remaining elements.


 */

// Before coding the solution, make your own all possible test cases.

// When declaring array, don't put variable in place of size. Use the size given
// in the problem.

// When finding max value, initialize answer to minimum value of that data type
// and vice-versa.

// When accessing index greater/smaller than current index, check if it lies in
// range of an array.

// When sorted array is input, then 2 pointer technique might work.
// Don't use if we want particular value again or if we want ALL duplicate
// pairs of values in array. Even if we use 2 pointer technique, we might get
// some duplicate pairs. In such cases prefer nested loops.

// To move cyclic way in array after last index, use mod operation.
// index = (index + i) % n

// Comparing arrays in java
// https://www.geeksforgeeks.org/compare-two-arrays-java/#:~:text=Java%20provides%20a%20direct%20method,of%20all%20classes%20in%20Java).

// When we have some array and we have to fill it, in that case start with one
// pointer pointing at first empty index that you want to fill.

// When problem asks something unique, there is chance to use set.

// For problems related to neighbours of array elements, In the loop:
// first check 0 index: i==0
// then last index: i==n-1
// then middle index: i>0 and i<n-1
// E.g., find elements which are greater than neighbours

// For problems related to "...than all right/left elements to element of an
// array", start iterating from that side on the array. You may need to keep
// track some value based on iterated part of the array to compare to current
// element.
// E.g., Find elements which are greater than all elements to right.