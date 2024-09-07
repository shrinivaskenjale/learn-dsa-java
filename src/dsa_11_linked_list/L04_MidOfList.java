package dsa_11_linked_list;

public class L04_MidOfList {
    static Node1 findMid(Node1 head) {
        Node1 slow = head;
        Node1 fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node1 head = new Node1(1);
        Node1 node2 = new Node1(2);
        Node1 node3 = new Node1(3);
        Node1 node4 = new Node1(4);
        Node1 node5 = new Node1(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node1 midNode = findMid(head);
        System.out.println(midNode.data);
    }
}

// Tortoise and hare algo
// 1. we have 2 pointers fast and slow
// 2. fast covers 2 nodes in jump and slow covers only 1 node.
// 3. when fast becomes null, slow will be pointing to middle node