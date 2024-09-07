package dsa_20_graph;

import java.util.*;

public class L03_ShortestPathInDAG {
    public static void main(String[] args) {
        int nodes = 6;
        int edges = 9;

        Graph g = new Graph(nodes, edges);

        // add all edges to graph
        g.addEdge(1, 3, 6);
        g.addEdge(1, 2, 2);
        g.addEdge(0, 1, 5);
        g.addEdge(0, 2, 3);
        g.addEdge(3, 4, -1);
        g.addEdge(2, 4, 4);
        g.addEdge(2, 5, 2);
        g.addEdge(2, 3, 7);
        g.addEdge(4, 5, -2);

        // compute the shortest path
        int src = 1;
        g.findShortestPathInDAG(src);
    }
}

class Graph {
    int n;
    int e;
    HashMap<Integer, ArrayList<ArrayList<Integer>>> map;

    Graph(int n, int e) {
        this.n = n;
        this.e = e;
        this.map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    void addEdge(int u, int v, int weight) {
        ArrayList<Integer> adjNode = new ArrayList<>();
        adjNode.add(v);
        adjNode.add(weight);
        this.map.get(u).add(adjNode);
    }

    void findShortestPathInDAG(int src) {
        // find topological sorting
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(i, visited, st);
            }
        }

        // now stack has topological sorting

        // now calculate distances
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;

        while (!st.isEmpty()) {
            int node = st.pop();

            if (distance[node] != Integer.MAX_VALUE) {
                for (ArrayList<Integer> edge : map.get(node)) {
                    int adjNode = edge.get(0);
                    int weight = edge.get(1);

                    if ((distance[node] + weight) < distance[adjNode]) {
                        distance[adjNode] = distance[node] + weight;
                    }
                }
            }
        }

        // we have distance from src node to all nodes
        System.out.println(Arrays.toString(distance));

    }

    void dfs(int node, boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for (ArrayList<Integer> adjNode : map.get(node)) {
            if (visited[adjNode.get(0)] == false) {
                dfs(adjNode.get(0), visited, st);
            }
        }
        st.push(node);
    }
}
