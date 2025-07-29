package dsa_04_maths;

public class L03_GCD {
    public static void main(String[] args) {
        System.out.println(getGCDByBruteForce(11, 13));
        System.out.println(getGCDByEuclideanAlgorithm(11, 13));
        System.out.println(getGCDByEuclideanAlgorithmSimple(11, 13));
    }

    // Time complexity: O(log min(a, b))
    public static int getGCDByEuclideanAlgorithm(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Time complexity: O(log min(a, b))
    public static int getGCDByEuclideanAlgorithmSimple(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a == 0 ? b : a;
    }


    // Time complexity: O(min(a,b))
    public static int getGCDByBruteForce(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

/*
The GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the
largest number that divides both numbers exactly without leaving a remainder.

======================
Euclidean algorithm
======================

The Euclidean algorithm finds the GCD of two numbers by repeatedly replacing the larger
number with the remainder of dividing it by the smaller, until the remainder becomes zero.

gcd(a, b) == gcd(b, a%b)
gcd(a, 0) == a
gcd(0, b) == b

gcd(48, 18)
→ gcd(18, 48 % 18) = gcd(18, 12)
→ gcd(12, 18 % 12) = gcd(12, 6)
→ gcd(6, 12 % 6)   = gcd(6, 0)
→ GCD is 6

Time complexity: O(log min(a, b))
- If a loop repeatedly divides, halves, or reduces a number significantly, it's usually O(log n).

 */