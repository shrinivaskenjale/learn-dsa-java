package dsa_16_heap;

public class L01_Implementation {
    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(50);
        h.add(55);
        h.add(53);
        h.add(52);
        h.add(54);
        h.print();

        System.out.println(h.remove());
        h.print();
    }
}

class Heap {
    int[] arr;
    int size;

    Heap() {
        this.arr = new int[100];
        this.size = 0;
    }

    void add(int value) {
        // update size
        this.size = this.size + 1;
        // insert at end of arr
        int index = size;
        arr[index] = value;

        // move to right position
        while (index != 1) {
            int parentIndex = index / 2;
            if (arr[index] > arr[parentIndex]) {
                // swap with parent
                int temp = this.arr[index];
                this.arr[index] = this.arr[parentIndex];
                this.arr[parentIndex] = temp;
                // update index
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    int remove() {
        // base case
        if (size == 0) {
            return -1;
        }
        // store the root value
        int value = arr[1];
        // copy last node to root
        arr[1] = arr[size];
        // delete last node
        size--;

        // rearrange
        int index = 1;
        while (index <= size) {
            // swap the node with greatest child
            int maxIndex = index;
            int leftIndex = index * 2;
            int rightIndex = index * 2 + 1;

            if (leftIndex <= size && arr[leftIndex] > arr[maxIndex]) {
                maxIndex = leftIndex;
            }
            if (rightIndex <= size && arr[rightIndex] > arr[maxIndex]) {
                maxIndex = rightIndex;
            }

            if (maxIndex == index) {
                break;
            } else {
                // swap data
                swap(maxIndex, index);
                index = maxIndex;
            }

        }
        return value;
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// =======================================================

// We use array to implement heaps.
// We will insert the values from index 1 in array.

// For node with index i (start from 1):
// left child index = 2*i
// right child index = 2*i + 1
// parent index = i/2

// For node with index i (start from 0):
// left child index = 2*i + 1
// right child index = 2*i + 2
// parent index = (i-1)/2

// =======================================================
// INSERTION
// =======================================================

// 1. Insert the new value at the end of the array.
// 2. For max heap: While new node is not root and greater than parent, swap
// with parent node.

// =======================================================
// DELETION
// =======================================================

// 1. Store the value of root in variable.
// 2. Put the value of last node in the root node.
// 3. Delete the last node.
// 4. Rearrange the nodes such that heap property is satisfied.