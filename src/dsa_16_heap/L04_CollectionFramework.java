package dsa_16_heap;

import java.util.*;

public class L04_CollectionFramework {
    public static void main(String[] args) {

        // =======================================================
        // MIN HEAP: Smallest item has higher priority
        // =======================================================

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        pq.offer(3);

        System.out.println(pq);

        // Get value of high priority item
        System.out.println(pq.peek());

        // Remove and return high priority item
        System.out.println(pq.poll());

        System.out.println(pq);

        // size
        System.out.println(pq.size());

        // check if empty
        System.out.println(pq.isEmpty());

        // =======================================================
        // MAX HEAP: Largest item has higher priority
        // =======================================================

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(2);
        pq2.offer(10);
        pq2.offer(7);
        System.out.println(pq2);
        System.out.println(pq2.peek());
        System.out.println(pq2.poll());
    }
}

// Note: When creating heap of custom objects, you need to pass the comparator.