package dsa_12_stack;

// Stack can be implemented with array and linked list.

public class L02_Implementation {
    public static void main(String[] args) {
        Stack st = new Stack(3);

        // push
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // peek
        System.out.println(st.peek());

        // pop
        st.pop();
        st.pop();
        System.out.println(st.pop());
        System.out.println(st.pop());

        // isEmpty
        System.out.println(st.isEmpty());
    }
}

class Stack {
    int top;
    int[] arr;
    int size;

    // constructor
    Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }

    int peek() {
        if (top == -1) {
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

}

// before pushing
// 1. check if space is available - stack overflow
// 2. increment top

// before popping
// 1. check if item is present - stack underflow
// 2. decrement top

// stack is empty when top == -1
// stack is full if top == size-1
