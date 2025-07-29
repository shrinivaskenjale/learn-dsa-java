package dsa_06_array;

public class L02_LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 40;

        System.out.println(linearSearch(arr, key));

    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

/*

Linear search is a simple algorithm that checks each element in a list one by one until
the target element is found or the list ends.

Time complexity: O(n)

Time complexity: O(1)

 */