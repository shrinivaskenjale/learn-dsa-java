package dsa_20_graph;

public class L01_AdjacencyMatrix {
    public static void main(String[] args) {
        GraphM g = new GraphM(3);
        g.add(1, 2);
        g.add(0, 2);
        g.add(2, 1);

        g.print();

        g.remove(0, 2);

        g.print();
    }
}

// Directed graph
class GraphM {
    int n;
    int[][] matrix;

    GraphM(int n) {
        this.n = n;
        matrix = new int[n][n];
    }

    void add(int from, int to) {
        matrix[from][to] = 1;
    }

    void remove(int from, int to) {
        matrix[from][to] = 0;
    }

    void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
 * If there are n nodes, matrix is n x n.
 * 
 * For matrix[u][v]:
 * 0 => edge absent from u to v
 * 1 => edge present from u to v
 * 
 * Space complexity is O(n^2).
 * Time complexity for adding, removing and checking edge is O(1).
 */