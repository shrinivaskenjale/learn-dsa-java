package dsa_14_binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class L01_Implementation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        // create tree;
        System.out.println("enter data for root");
        root = buildTree(root, sc);

        // level order traversal
        System.out.println("\nlevel order traversal is:");
        levelOrderTraversal(root);

        // inorder traversal
        System.out.println("\ninorder traversal is:");
        inorderTraversal(root);

        // preorder traversal
        System.out.println("\n\npreorder traversal is:");
        preorderTraversal(root);

        // postorder traversal
        System.out.println("\n\npostorder traversal is:");
        postorderTraversal(root);

        sc.close();
    }

    static Node buildTree(Node root, Scanner sc) {
        // take input of root of current tree
        int data = sc.nextInt();

        root = new Node(data);

        // base case: -1 means null
        if (data == -1) {
            return null;
        }

        // build left subtree of root
        System.out.println("Enter data for inserting in left of " + data);
        root.left = buildTree(root.left, sc);

        // build right subtree of root
        System.out.println("Enter data for inserting in right of " + data);
        root.right = buildTree(root.right, sc);

        // after the tree is generated, return root
        return root;
    }

    static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        // Queue data structure is used for level order traversal
        // Note: ArrayDeque does not allow insertion of null, that is why used
        // LinkedList
        Queue<Node> q = new LinkedList<>();

        // add root in queue
        q.offer(root);

        // Optional: to separate levels, we add null to q
        q.offer(null);

        while (!q.isEmpty()) {
            // when we dequeue from queue, we get items in level order
            Node node = q.poll();

            if (node == null) {
                // means we completed one level which means, all nodes in next level are in
                // queue now
                System.out.println();
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            } else {
                System.out.print(node.data + " ");

                // add left and then right child of node in queue
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

        }

    }

    static void inorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    static void preorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    static void postorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

}

// Example input:
// 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
