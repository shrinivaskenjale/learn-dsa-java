package dsa_21_dynamic_programming;

public class Points {

}

// https://www.geeksforgeeks.org/dynamic-programming/

// There are 2 approaches to solve DP problems:
// 1. top-down = recursion + memoization
// We build solution from actual problem and solving its subproblems.
//
// 2. bottom-up = iteration + tabulation
// We build solution from base case.

// Memoization and tabulation are processes of storing solutions of subproblems.
// We can use hashmap or n-dimensional arrays to store the results of
// subproblems.
// 'n' is equal to number variables on which solution to given problem depends.

// Top-down approach:
// 1. Solve the problem using plain recursion.
// 2. Create data structure according number of variables on which solution
// depends.
// 3. In recursion code, after base case, add code to check if answer to current
// problem exists in data structure or not. If exists, return answer else,
// calculate the answer and before you return the answer, store it in data
// structure.

// Bottom-up approach:
// 1. Find top-down approach and convert it to bottom-up.
// 2. Create data structure to store answer.
// 3. Store answers of base case in data structure.
// 4. Iterate over the empty spaces of data structure.
// 5. Inside iteration write the logic used in top-down approach. Only change is
// that instead of recursive call, access the solutions from data structure.

// You can optimize space in bottom-up approach by identifying how many previous
// values are needed to solve bigger problem. E.g., in fibonacci problem, we
// just need previous 2 values to find next fibonacci number. Instead of
// creating array of size n+1, we can just track 2 previous values.