package dsa_04_maths;

import java.util.*;

public class L01_Divisors {
    public static void main(String[] args) {
        int n = 36;

        System.out.println(getDivisors(n));
    }

    public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors); // optional, if order matters
        return divisors;
    }
}

/*
You only need to loop till √n to find divisors.

For each i such that i * i <= n:
=> If i divides n, then both i and n/i are divisors.
=> Add both to the result list (avoid duplicates when i == n/i).

Sorting at the end gives them in increasing order (if required).

Time Complexity: O(√n)
 */
