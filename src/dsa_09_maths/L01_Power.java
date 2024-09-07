package dsa_09_maths;

public class L01_Power {
    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }

    // O(log(b))
    static int power(int a, int b) {
        int ans = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                // b is odd
                ans = ans * a;
            }
            a = a * a;
            b = b >> 1; // b/2
        }

        return ans;
    }
}

// a^b

// Brute force approach:
// Multiplying a, b times
// Time complexity is O(b)

// Optimized approach: Fast power
// a^b = (a^2)^(b/2) ...b is even
// a^b = (a^(b-1))*b ...b is odd
// Time complexity is O(log(b))
