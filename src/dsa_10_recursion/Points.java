package dsa_10_recursion;

public class Points {

}

// Recursive problems which have multiple answers, those recursive functions
// don't return value. Instead in the base condition they:
// a) store the result in some data structure or
// b) print the result
// Ex. choice problems.

// A recursive function solves a particular problem by calling a copy of itself
// and solving smaller subproblems of the original problems.

// In recursion, solution of problem depends on solution of smaller problem of
// same type.

/*
 * Example:
 * 1. 2^n = 2 * 2^(n-1)
 * 2. n! = n * (n-1)!
 */

/*
 * Steps to solve recursion:
 * 
 * 1. First find base case. It tells where to stop the recursion. It is
 * mandatory to use return statement in base case condition.
 * 
 * 2. Find recurrence relation.
 */

// When a function is called, it is pushed on the 'function call stack' and when
// function at the top of the call stack returns some value, it popped from
// stack.

// Types of recursion
// https://www.geeksforgeeks.org/types-of-recursions/

// https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118522/offering/1380913

// Subsequences using iterative approach and bit manipulation
// https://www.geeksforgeeks.org/print-subsequences-string-iterative-method/

// When we use backtracking with recursion, then whatever state you change,
// revert it back to original state at the end of the same scope.