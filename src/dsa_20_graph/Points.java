package dsa_20_graph;

public class Points {

}

// BFS uses queue => has breadth
// DFS uses stack => has depth

// When using DFS think as if you are processing current node and then making
// recursive call to process the component which includes adjacent node.

// To represent non-weighted graph use following hashmap:
// HashMap<Integer, ArrayList<Integer>>
// Key denotes node and value denotes arraylist of all adjacent nodes.

// To represent weighted graph use following hashmap:
// HashMap<Integer, ArrayList<ArrayList<Integer>>>
// Key denotes node and value denotes arraylist of all adjacent nodes. Inner
// array list's 0-index value denotes adjacent node and 1-index value denotes
// weight of the edge connected to it.

// Dikstra does not work on graph with negative edges.
// Bellman-Ford dose not work on graph with negative weight cycle.

// Prefer dijkstra for undirected graph.
// Prefer bellman-ford for directed graph.

// ==============================================================
// Spanning Tree

// When you convert graph into tree (no cycles) such that it contains n nodes
// and n-1 edges and all nodes are reachable from all other nodes then it is
// called spanning tree.

// There can exist many spanning trees for given graph.

// Spanning tree with minimum sum of weights of edges is called MINIMUM SPANNING
// TREE.

// We have 2 algorithms to find MST:
// 1. Prim's algorithm
// 2. Kruskal's algorithm

// These algorithms work on undirected graphs.
// https://www.geeksforgeeks.org/why-prims-and-kruskals-mst-algorithm-fails-for-directed-graph/

// ==============================================================

// Union By Rank and Path Compression in Union-Find Algorithm
// https://www.geeksforgeeks.org/union-by-rank-and-path-compression-in-union-find-algorithm/

// We create 2 DS:
// 1. parent: stores parent of each node (initially node itself)
// 2. rank: stores rank of each node (initially 0 for all nodes)

// We know we have reached the parent of node if (parent[node] == node).

// Union By Rank:
// union(a,b) =>
// 1. find aParent and bParent
// 2. findRanks of aParent and bParent
// 3. if ranks are same make aParent a parent of bParent and increase rank of
// aParent
// 4. else make smaller rank one a parent of other one

// Path Compression:
// When we get query findParent(a) and we get aParent then update the parent of
// a in data structure such that parent of a is aParent.

// Time complexity of union and find operation is nearly constant.