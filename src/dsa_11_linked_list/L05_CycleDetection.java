package dsa_11_linked_list;

public class L05_CycleDetection {

}

// Basic approach to detect cycle is to create hashmap <Node, Boolean> which
// tracks if node is visited or not. If we get already visited node while
// traversing, we detect a cycle.

// =========================================================
// Floyd's cycle detection algorithm
// =========================================================

// https://www.geeksforgeeks.org/floyds-cycle-finding-algorithm/

// https://www.youtube.com/watch?v=VxOFflTXlXo&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=52&t=880s

// Set slow and fast pointer at head of the ll, move slow pointer 1 node and
// fast pointer 2 nodes in one jump.

// When slow pointer reaches the loop's starting node, after each movement of
// slow pointer, distance between slow and fast pointer decreases by 1. At some
// point, the difference will become 0.

// To find starting node of loop, move slow pointer to head and start movement
// of both pointers by only 1 jump. The node where they meet is starting node.

// To prove this, consider
// dist(head, loop start node) = A
// dist(loop start node, intersection node) = B
// length of loop = C
// dist(fast pointer) = 2 * dist(slow pointer)
// A + xC + B = 2 * (A + yC + B)
// A + B = C * (x - 2y)
// A + B = C * k
// => So, A+B is equivalent to completing a cycle k times.
// So, dist(intersection node, loop start node) = A
// So, we cover same distance from head and intersection node to reach loop's
// starting node.