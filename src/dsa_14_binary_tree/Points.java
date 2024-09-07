package dsa_14_binary_tree;

public class Points {

}

// Tree is a non linear data structure.
// Binary tree is type of tree when each node can have at most 2 children nodes.

/*
 * Terms:
 * 1. Node: Entity which stores data.
 * 2. Root: Top node from where tree starts.
 * 3. Children: Node which is connected directly to node above it. In binary
 * trees, a node can have <=2 children.
 * 4. Parent: Node which is connected directly to node below it. Node can have
 * only one parent.
 * 5. Siblings: Nodes having same parent node.
 * 6. Ancestors: All nodes that are at the upper level of the given node.
 * 7. Descendants: All nodes that are at the lower level of the given node.
 * 8. Leaf: Node having no children.
 * 9. Height: The height of a Binary Tree is defined as the maximum depth of any
 * leaf node from the root node. That is, it is the length of the longest path
 * from the root node to any leaf node.
 */

/*
 * Node contains following:
 * 1. data
 * 2. pointer to left child / null
 * 3. pointer to right child / null
 */

/*
 * Inorder traversal:
 * 1. traverse left subtree
 * 2. visit node
 * 3. traverse right subtree
 */
/*
 * Preorder traversal:
 * 1. visit node
 * 2. traverse left subtree
 * 3. traverse right subtree
 */
/*
 * Postorder traversal:
 * 1. traverse left subtree
 * 2. traverse right subtree
 * 3. visit node
 */