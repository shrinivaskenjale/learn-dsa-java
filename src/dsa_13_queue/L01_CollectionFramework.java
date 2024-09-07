package dsa_13_queue;

import java.util.*;

public class L01_CollectionFramework {

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Insert at tail
        queue.offer(7);

        System.out.println(queue);

        // Peek at head
        System.out.println(queue.peek());

        // remove at head and return
        System.out.println(queue.poll());

        // size of deque
        System.out.println(queue.size());

        // empty the deque
        queue.clear();

        System.out.println(queue);

        // check if empty
        System.out.println(queue.isEmpty());

    }
}

// If you want normal queue(FIFO) => for adding use 'offer()' and removal use
// 'poll()'.