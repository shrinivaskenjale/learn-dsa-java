package dsa_20_graph;

import java.util.*;

public class L02_AdjacencyList {
    public static void main(String[] args) {
        GraphL g = new GraphL();

        g.add(0, 1);
        g.add(1, 2);
        g.add(2, 3);
        g.add(3, 1);
        g.add(3, 4);
        g.add(0, 4);

        g.print();
    }
}

// Directed graph
class GraphL {
    HashMap<Integer, ArrayList<Integer>> map;

    GraphL() {
        map = new HashMap<>();
    }

    void add(int from, int to) {
        // get adjacency list of from node and add to node to it
        ArrayList<Integer> list = map.getOrDefault(from, new ArrayList<>());
        list.add(to);
        map.put(from, list);

    }

    void print() {
        for (Integer node : map.keySet()) {
            System.out.println(node + " => " + map.get(node));
        }
    }
}

/*
 * We store list of adjacent nodes of every node.
 * We will use hashmap whose key is node and value is list of adjacent nodes.
 * Array of arrays can also be used if we can map node to index of an array.
 */