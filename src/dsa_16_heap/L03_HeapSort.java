package dsa_16_heap;

import java.util.Arrays;

public class L03_HeapSort {
    public static void main(String[] args) {
        // 0 based indexing
        int[] arr = { 6, 3, 5, 1, 8, 0 };
        int size = arr.length;

        heapSort(arr, size);

        System.out.println(Arrays.toString(arr));
    }

    static void heapSort(int[] arr, int size) {
        createHeap(arr, size);

        while (size != 0) {
            swap(arr, 0, size - 1);
            size--;
            heapify(arr, size, 0);
        }
    }

    static void createHeap(int[] arr, int size) {
        for (int i = (size - 2) / 2; i >= 0; i--) {
            heapify(arr, size, i);
        }
    }

    static void heapify(int[] arr, int size, int index) {
        while (index <= size - 1) {
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;
            int maxIndex = index;

            if (leftIndex <= size - 1 && arr[leftIndex] > arr[maxIndex]) {
                maxIndex = leftIndex;
            }
            if (rightIndex <= size - 1 && arr[rightIndex] > arr[maxIndex]) {
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

// If we use min-heap we get decreasing order.
// If we use max-heap we get increasing order.

// Logic is same as deletion.

// 1. Convert array to heap.
// 2. Swap the root with last leaf node.
// 3. Decrease the size of the heap.
// 4. Heapify the root.
// 5. Repeat steps 2-5 until size of heap is not 0.