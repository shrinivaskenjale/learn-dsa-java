package dsa_01_basics;

import java.util.Scanner;

public class L05_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        // check divisor in range [2,n)
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}

// Primes are integers greater than one with no positive divisors besides one
// and itself. Negative numbers are excluded.