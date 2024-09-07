package dsa_13_queue;

import java.util.*;

public class L04_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // Insert at front
        adq.offerFirst(3);

        // Insert at rear
        adq.offer(7);
        adq.offerLast(4);

        System.out.println(adq);

        // Peek at front
        System.err.println(adq.peekFirst());
        System.out.println(adq.peek());

        // Peek at rear
        System.out.println(adq.peekLast());

        // Poll at front
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst()); // null if empty

        // poll at rear
        System.out.println(adq.pollLast()); // null if empty

        // size of deque
        System.out.println(adq.size());

        // empty the deque
        adq.offerLast(4);
        System.out.println(adq);
        adq.clear();
        System.out.println(adq);

        // check if empty
        System.out.println(adq.isEmpty());

    }
}

// Deque means double ended queue

// Insertion and deletion can happen at both front and rear

// Implement Deque
// https://www.codingninjas.com/codestudio/problems/deque_1170059