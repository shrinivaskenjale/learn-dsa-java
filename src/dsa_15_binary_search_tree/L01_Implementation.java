package dsa_15_binary_search_tree;

public class L01_Implementation {
    public static void main(String[] args) {

        // ======================================
        // INSERT
        // ======================================

        int[] arr = { 6, 3, 5, 1, 8, 4, 9, 0, 3 };

        Node root = null;
        for (int data : arr) {
            root = insert(root, data);

        }

        // ======================================
        // TRAVERSE
        // ======================================

        inorder(root);
        System.out.println();

        // ======================================
        // SEARCH
        // ======================================

        System.out.println(search(root, 9));
        System.out.println(search(root, 11));

        // ======================================
        // REMOVE
        // ======================================

        remove(root, 6);
        System.out.println(search(root, 6));
        inorder(root);
        System.out.println();
    }

    // recursive function to insert data into bst with given root
    // O(logN)
    static Node insert(Node root, int data) {
        // base case: root is null
        // new node will be the root
        if (root == null) {
            return new Node(data);
        }

        // if data < root insert in left subtree
        // since we are making recursive call to insert in left subtree of the root, it
        // will return root of the left subtree
        if (data < root.data) {
            root.left = insert(root.left, data);

        }

        // if data > root insert in right subtree
        if (data >= root.data) {
            root.right = insert(root.right, data);
        }

        // finally return root of the current subtree
        return root;
    }

    // O(logN)
    static boolean search(Node root, int x) {
        // if root is null, x can't exist in empty tree
        if (root == null) {
            return false;
        }

        // root of given tree matches with x
        if (root.data == x) {
            return true;
        }

        // if x < root, search in left subtree
        // else in right subtree
        if (x < root.data) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
        }
    }

    static Node remove(Node root, int data) {
        // base case
        if (root == null) {
            return null;
        }

        // if root == data
        // 1. if root has 0 child, delete the root and new root will be null
        // 2. if root has only 1 child, delete the root and new root will be that child
        // 3. if root has 2 children, we have 2 options:
        // a. copy the content of predecessor in the root and delete predecessor
        // b. copy the content of successor in the root and delete successor

        if (root.data == data) {
            // 0/1 child case:
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // 2 child case:
            Node predecessorNode = findPredecessor(root);
            root.data = predecessorNode.data;
            root.left = remove(root.left, root.data);
            return root;

        } else if (data < root.data) {
            // remove data from left subtree
            root.left = remove(root.left, data);
            return root;
        } else {
            // remove data from right subtree
            root.right = remove(root.right, data);
            return root;
        }
    }

    static Node findPredecessor(Node root) {
        Node curr = root.left;
        if (curr == null) {
            return null;
        }
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }
}

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
