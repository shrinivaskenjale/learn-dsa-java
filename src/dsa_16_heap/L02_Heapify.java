package dsa_16_heap;

import java.util.Arrays;

public class L02_Heapify {
    public static void main(String[] args) {
        // using 1 based indexing
        int[] arr = { -1, 54, 53, 55, 52, 50 };
        int n = 5;
        createMaxHeap(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    // O(N) => study about time complexity
    static void createMaxHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, n, i);
        }
    }

    // O(logN)
    static void heapify(int[] arr, int n, int index) {

        while (index <= n) {
            int leftIndex = 2 * index;
            int rightIndex = 2 * index + 1;
            int maxIndex = index;
            if (leftIndex <= n && arr[leftIndex] > arr[maxIndex]) {
                maxIndex = leftIndex;
            }
            if (rightIndex <= n && arr[rightIndex] > arr[maxIndex]) {
                maxIndex = rightIndex;
            }

            if (maxIndex != index) {
                swap(arr, maxIndex, index);
                index = maxIndex;
            } else {
                break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

// Heapify algorithm converts array into a heap.

// First non-leaf node is parent of last node i.e. node at n/2 index.
// So, leaf nodes lie in range (n/2)+1 to n.

// Leaf nodes satisfy heap property so we do not need to process them.
// We will process all non-leaf nodes from index n/2 to 1.

// Heapify algorithm places the root of the subtree in right position. So, we
// will apply heapify algorithm for all non-leaf nodes bottom-up.