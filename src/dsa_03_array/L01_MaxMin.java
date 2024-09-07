package dsa_03_array;

public class L01_MaxMin {
    public static void main(String[] args) {
        int[] a = { 53, 234, 45, 342, 6, 134, 75 };

        System.out.println("max value is: " + getMaxValue(a));
        System.out.println("min value is: " + getMinValue(a));
    }

    // max value in array
    static int getMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // min value in array
    static int getMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
