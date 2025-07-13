package dsa_07_binary_search;

public class Points {

}

// When we can neglect the left or right part by finding a possible/not possible
// solution on a sorted answer search space, we can use BINARY SEARCH.

// We can use storing answer method for all problems. But, at last before
// returning answer, check for corner cases. E.g., pivot element/peak of
// mountain etc.

// When whole array is not sorted, but some subarrays of it are sorted then try
// to draw lines to find logic.

// In problems like aggresive cows or allocate books, where we have to create
// our own search space, trick to identify problems is that:
// 0. Everything is contiguos.
// 1. In aggresive cows, we are asked for max value of min distance between
// the two cows.
// 2. In allocate books, we are asked for min value of max pages allowed to
// student. Simalarly, in painter's partition problem, we are asked for minimum
// value of maximum time given to individual painter.

// Where we have to find minimum value, no. of distributions can be <= given
// candidates.
// E.g., in book allocation problem, all books can be distributed among <= k
// students for given limit.

// Where we have to find maximum value, no. of distributions can be >= given
// candidates.
// E.g., in aggresive cows problem, no. of cows that can be placed safely can be
// >= k for the given limit.
