package dsa_18_trie;

public class L01_Implementation {

    public static void main(String[] args) {
        TrieNode root = new TrieNode('a');
        System.out.println(root.children[3]);
    }

    // =================================================
    // INSERTION
    // =================================================

}

class TrieNode {
    // stores data
    char data;
    // stores children of current node
    TrieNode[] children;
    // stores if current node is last node of any entry
    boolean isTerminal;

    TrieNode(char ch) {
        data = ch;
        children = new TrieNode[26];
        isTerminal = false;
    }
}
