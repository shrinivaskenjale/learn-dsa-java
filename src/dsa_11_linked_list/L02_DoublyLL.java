package dsa_11_linked_list;

public class L02_DoublyLL {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
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
    }
}

class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {

    Node2 head;
    // Node2 tail; // optional (gives)

    void insertAtHead(int data) {
        // create new node
        Node2 newNode = new Node2(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    void insertAtTail(int data) {
        Node2 newNode = new Node2(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node2 currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        newNode.prev = currNode;
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

        Node2 currNode = this.head;
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

        Node2 newNode = new Node2(data);
        newNode.next = currNode.next;
        newNode.prev = currNode;
        if (currNode.next != null) {
            // if currNode is last node
            currNode.next.prev = newNode;
        }
        currNode.next = newNode;
    }

    void deleteAtHead() {
        if (this.head == null) {
            return;
        }
        this.head.next.prev = null;
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
        Node2 currNode = this.head;
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

        Node2 currNode = this.head;
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
        if (currNode.next.next != null) {
            currNode.next.next.prev = currNode;
        }
        currNode.next = currNode.next.next;

    }

    void print() {
        Node2 currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}

// In doubly LL, each node keeps track of the next node and previous node.
// We use head pointer to keep track of first node of the LL.
// We use tail pointer to keep track of last node. This is optional.
// Head's previous node and tail's next node is null.
