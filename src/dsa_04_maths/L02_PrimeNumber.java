package dsa_04_maths;

public class L02_PrimeNumber {

    public static void main(String[] args) {
        int n = 57;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        int divisors = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors++;
                if (i != n / i) {
                    divisors++;
                }
                if (divisors > 2) {
                    return false; // early exit
                }
            }
        }
        return divisors == 2;
    }
}


/*
A prime number is a natural number greater than 1 that has exactly two distinct positive
divisors: 1 and itself.

Time complexity: O(√n)
 */