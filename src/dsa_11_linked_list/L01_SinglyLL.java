package dsa_11_linked_list;

import java.util.*;

public class L01_SinglyLL {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(0);
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.print();
        list.insertAtPosition(10, 4);
        list.print();
        list.insertAtPosition(20, 1);
        list.print();
        list.insertAtPosition(30, 11);
        list.insertAtPosition(50, 9);
        list.print();

        System.out.println(list.head.data);

        list.deleteAtHead();
        list.print();
        list.deleteAtTail();
        list.print();
        list.deleteAtPosition(3);
        list.print();

        Map<Node1, Boolean> a = new HashMap<>();
        a.put(null, true);
        System.out.println(a.get(null));
    }
}

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {

    Node1 head;
    // Node1 tail; // optional (gives)

    void insertAtHead(int data) {
        // create new node
        Node1 newNode = new Node1(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    }

    void insertAtTail(int data) {
        Node1 newNode = new Node1(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node1 currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    void insertAtPosition(int data, int pos) {
        // insert at first position
        if (pos == 1) {
            insertAtHead(data);
            return;
        }
        // linked list is empty but pos>1
        if (this.head == null) {
            System.out.println("invalid");
            return;
        }

        Node1 currNode = this.head;
        int currPos = 1;
        while (currPos != pos - 1 && currNode != null) {
            currNode = currNode.next;
            currPos++;
        }
        // LL is too short
        if (currPos != pos - 1) {
            System.out.println("invalid");
            return;
        }

        Node1 newNode = new Node1(data);
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    void deleteAtHead() {
        if (this.head == null) {
            return;
        }
        this.head = this.head.next;
    }

    void deleteAtTail() {
        if (this.head == null) {
            return;
        }
        // list has only 1 node
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        // traverse to second last node
        Node1 currNode = this.head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    void deleteAtPosition(int pos) {
        // if first pos
        if (pos == 1) {
            deleteAtHead();
            return;
        }
        if (this.head == null) {
            return;
        }

        Node1 currNode = this.head;
        int currPos = 1;

        while (currPos != pos - 1 && currNode != null) {
            currNode = currNode.next;
            currPos++;
        }
        // LL is too short
        if (currPos != pos - 1) {
            return;
        }
        if (currNode.next == null) {
            return;
        }

        // update pointers
        currNode.next = currNode.next.next;

    }

    void print() {
        Node1 currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}

// In singly LL, each node keeps track of the next node.
// We use head pointer to keep track of first node of the LL.
// We use tail pointer to keep track of last node.
// Last node always points to null.

// Insertion
// 0. Create new node.
// 1. First check if LL is empty.
// 2. Traverse to the previous node of desired position.
// 2. Update the pointers of new node.
// 3. Update the pointers of node ahead the new node.
// 4. Update the pointers of node behind the new node.

// Deletion
// 0. First check if LL is empty.
// 1. Check if LL contains only one node.
// 2. Traverse to the previous node of the node to be deleted.
// 3. Update the pointers of other nodes.