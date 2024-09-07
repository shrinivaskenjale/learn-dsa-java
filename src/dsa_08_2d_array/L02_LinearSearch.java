package dsa_08_2d_array;

public class L02_LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
        };

        int[] pos = linearSearch(arr, 111);
        if (pos != null) {
            System.out.println("Key present at " + pos[0] + " row and " + pos[1] + " column.");
        } else {
            System.out.println("Key not found.");
        }
    }

    static int[] linearSearch(int[][] arr, int key) {
        int rowCount = arr.length;
        int colCount = arr[0].length;

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                if (arr[row][col] == key) {
                    int[] ans = { row, col };
                    return ans;
                }
            }
        }
        return null;
    }
}

// Time complexity: O(row*col)