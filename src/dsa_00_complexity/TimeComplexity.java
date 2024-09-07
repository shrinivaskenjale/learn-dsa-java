package dsa_00_complexity;

public class TimeComplexity {
    public static void main(String[] args) {

    }
}

// =================================================
// References
// =================================================

// https://www.geeksforgeeks.org/time-complexity-and-space-complexity/

// https://www.codingninjas.com/codestudio/guided-paths/competitive-programming/content/126222/offering/1476042

// =================================================
// Time complexity and notations:
// =================================================

// Time complexity: It is amount of time taken by algorithm to run as a function
// of size of the input.

// Notations to represent complexity:
// Big O: upper bound complexity
// Theta: average case complexity
// Omega: lower bound complexity

// =================================================
// Time complexities in increasing order:
// =================================================

// O(1)
// O(logN)
// O(N)
// (NlogN)
// O(N^2)
// O(N^3)
// O(2^N)
// O(N!)

// =================================================
// Big O notation calculation:
// =================================================

// 1. ignore lower degree terms
// 2. ignore any constants

// Examples:
// 2n^2 + 3n => n^2
// 4n^4 + 3n^3 => n^4
// n^2 + logn => n^2
// 1234 => 1
// 3N^3 + 2n^2 + 5 => n^3
// (n^3)/200 => n^3
// 5n^2 + logn => n^2
// n/4 => n
// (n+4)/4 => n

// =================================================
// Steps to find time complexity of functions:
// =================================================

// Since we are finding big O notation, always take worst case of each
// statement.

// Add complexities of all statements in an function.

// Variable assignments have linear complexity.

// For iteration, count number of iterations in terms of user input.
// Multiply the count of iteratinos with maximum complexity of body of loop.
// If iterations are nested, multiply count of each iteration.
// In case of nested loop which depends upon outer loop variable, consider worst
// case i.e., maximum number of times inner loop executes.

// For recursion, refer https://www.youtube.com/watch?v=gCsfk2ei2R8
// 1) Build tree for time complexity for each call assuming that calling
// recursive function is O(1).
// 2) Add time complexities of each function calls in each level.
// 3) Add time complexities of all levels.

// If only few recursive calls execute inside recursive function, consider the
// one which goes deep or which reaches slowly to base condition.

// Sometimes, you need to find out number of levels, in that case, convert input
// size at each level in some common formula in terms of constant k and finally
// compare that value with your base case.

// =================================================
// Common time complexities:
// =================================================

// Let n be the main variable in the problem.

// If n ≤ 12, the time complexity can be O(n!).
// If n ≤ 25, the time complexity can be O(2^n).
// If n ≤ 100, the time complexity can be O(n^4).
// If n ≤ 500, the time complexity can be O(n^3).
// If n ≤ 10^4, the time complexity can be O(n^2).
// If n ≤ 10^6, the time complexity can be O(n log n).
// If n ≤ 10^8, the time complexity can be O(n).
// If n > 10^8, the time complexity can be O(log n) or O(1).

// Computer can perform around 10^8 operations in 1 second. So if time limit is
// given you can identify expected time complexity.

// =================================================
// Master's theorem
// =================================================

// Using Master's theorem, you can find time complexity of any recursive
// function using recurrence relation.
