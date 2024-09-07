package dsa_00_practice;

import java.util.*;

class TreeNode<T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    TreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static ArrayList<Integer> predecessorSuccessor(TreeNode<Integer> root, int key) {
        ArrayList<Integer> ans = new ArrayList<>();

        TreeNode<Integer> keyNode = findNode(root, key);

        ans.add(predecessor(keyNode));
        ans.add(successor(keyNode));

        return ans;
    }

    static TreeNode<Integer> findNode(TreeNode<Integer> root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key) {
            return root;
        }
        if (key < root.data) {
            return findNode(root.left, key);
        } else {
            return findNode(root.right, key);
        }
    }

    static Integer predecessor(TreeNode<Integer> root) {
        TreeNode<Integer> curr = root.left;
        if (curr == null) {
            return -1;
        }
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }

    static Integer successor(TreeNode<Integer> root) {
        TreeNode<Integer> curr = root.right;
        if (curr == null) {
            return -1;
        }
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
    }

}