package dsa_10_recursion;

public class L06_FastPower {
    static int run = 0;

    public static void main(String[] args) {
        System.out.println(power(3, 11));
        System.out.println(run);
    }

    static int power(int a, int b) {
        run++;
        if (b == 0) {
            return 1;
        }

        int temp = power(a, b / 2);
        if ((b & 1) == 1) {
            return a * temp * temp;
        } else {
            return temp * temp;
        }
    }
}

// calculate a^b
// Optimized approach: Fast power
// b is even => a^b = a^(b/2) * a^(b/2)
// b is odd => a^b = a * a^(b/2) * a^(b/2)
// Time complexity is O(log(b))