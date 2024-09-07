package dsa_10_recursion;

public class L03_SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr, arr.length));
    }

    static int sum(int[] arr, int n) {
        // if size of array is 0 then sum is 0
        if (n == 0) {
            return 0;
        }

        // if we know sum of array of size n-1 then we can just add last item to it
        return sum(arr, n - 1) + arr[n - 1];
    }
}
