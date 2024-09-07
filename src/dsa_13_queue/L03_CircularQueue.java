package dsa_13_queue;

public class L03_CircularQueue {

}

// Circular Queue
// https://www.codingninjas.com/codestudio/problems/circular-queue_1170058

/*
 * In circular queue, both ends of array joined in circular way.
 * This is space optimized version of normal queue.
 * 
 * We take mod with size of the queue to get valid index.
 * To check queue is full: front==(rear+1)%size
 */