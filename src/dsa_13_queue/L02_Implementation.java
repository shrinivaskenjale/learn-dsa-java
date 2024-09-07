package dsa_13_queue;

// Queue can be implemented with array and linked list.

public class L02_Implementation {
    public static void main(String[] args) {
        Queue st = new Queue(3);

        // enqueue
        st.enqueue(1);
        st.enqueue(2);
        st.enqueue(3);
        st.enqueue(4);

        // peek
        System.out.println(st.peek());

        // dequeue
        st.dequeue();
        st.dequeue();
        System.out.println(st.dequeue());
        System.out.println(st.dequeue());

        // isEmpty
        System.out.println(st.isEmpty());
    }
}

class Queue {
    int front;
    int rear;
    int[] arr;
    int size;

    // constructor
    Queue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue overflow");
            return;
        }
        rear++;
        arr[rear] = data;

        if (front == -1) {
            front++;
        }
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue underflow");
            return -1;
        }
        int value = arr[front];

        // last item
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return value;
    }

    int peek() {
        if (front == -1) {
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

}

// https://www.codingninjas.com/codestudio/problems/queue-using-array-or-singly-linked-list_2099908

// initially front and rear are -1

// before enqueue
// 1. check if space is available - queue overflow
// 2. increment rear
// 3. if current item is first, increment front

// before dequeue
// 1. check if item is present - queue underflow
// 2. increment front
// 3. if queue becomes empty front>rear, reset front and rear to -1

// queue is empty when front==-1 or rear==-1
// queue is full if rear == size-1
