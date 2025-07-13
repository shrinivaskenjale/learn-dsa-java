package dsa_04_maths;

public class L04_Power {
    public static void main(String[] args) {
        System.out.println(fastPower(3, 5));
    }

    // O(log(n))
    public static long fastPower(long a, long n) {
        long result = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                // If n is odd, take out one a and multiply to result.
                // a^n = a * a^(n-1)
                result = result * a;

                // This drops power to n-1 which is even.
                // For integer division, when n is odd, n/2 and (n-1)/2  are same.
                // So following line is optional.
                // n = n - 1;
            }

            // a^n = (a^2)^(n/2)
            a = a * a;
            n = n >> 1;
        }

        return result;
    }
}

/*

======================
Brute Force Approach
======================

a^n = a * a * a * ... n times

Time complexity: O(n)

===================
Fast Power Method
===================

The Fast Power Method, also known as Exponentiation by Squaring, is an efficient algorithm
to compute a^n (a raised to the power n) in O(log n) time instead of the naive O(n) time.

If n is even: a^n = (a ^ 2) ^ (n / 2)
If n is odd: a^n = a * (a ^ 2) ^ (n / 2)

Time complexity: O(log(n))

==========
Example:
==========

3^5

Initially:
result = 1
a = 3
n = 5

Iteration       result      a       n
-------------------------------------------
1               3           9       2
2               3           81      1
3               243         6561    0

Finally:
result = 243


 */

