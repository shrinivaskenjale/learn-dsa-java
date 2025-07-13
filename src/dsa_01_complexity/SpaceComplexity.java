package dsa_01_complexity;

public class SpaceComplexity {

}

// =================================================
// Space complexity:
// =================================================

// It is amount of extra memory (memory apart from the input)
// taken by algorithm to run as a function of size of the input.

// O(1) => simple variables, array of fixed size(irrespective of input size)
// O(n) => container data structures like arrays whose size depends on input
// size.

// =================================================
// Recursive functions:
// =================================================

// Add following complexities:

// 1) Recursion call stack will take some space which will be equal to maximum
// depth of recursion tree.

// 2) If you create extra space before calling recursive functions, add all
// extra spaces of longest path.
// But if you create space after finishing the recursive calls, space will be
// maximum space at any node of the longest path in recursion tree.
