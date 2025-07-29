package dsa_04_maths;

public class Points {

}
/*
==================================================
Prime number
==================================================

https://www.geeksforgeeks.org/prime-numbers/

A prime number is a natural number greater than 1 that is not a product of two smaller
natural numbers.

Prime number can be divided exactly only by itself and 1.

If n is divisible by any number between [2,n), then it is not prime.

==================================================
Composite number
==================================================

A natural number greater than 1 that is not prime is called a composite
number.

Sieve of Eratosthenes
https://www.geeksforgeeks.org/sieve-of-eratosthenes/

Segmented Sieve
https://www.geeksforgeeks.org/segmented-sieve/

==================================================
GCD
==================================================

In mathematics, the greatest common divisor (GCD) of two or more integers,
which are not all zero, is the largest positive integer that divides each of
the integers.
gcd(8,12) = 4

Euclidean algorithm
https://www.codingninjas.com/codestudio/library/gcd-euclidean-algorithm
https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/

gcd(a,b) = gcd(a-b,b) = gcd(b,a%b)

gcd(a,b) * lcm(a,b) = a * b

==================================================
Modular Arithmetic
==================================================

a % m => [0,m-1]

if a == m then 0
if a < m then a
if a is multiple of m then 0

It is used to keep result of program inside valid range. This avoids
overflow. In modular arithmetic of m, numbers with same mod value are
congruent.
Ex., 5 = 3 mod 2

Suppose length and breadth of rectangle are 10^12, then area will be 10^24
which will cause overflow. So using modular arithmetic we do exceed the
limit.

Modular Arithmetic for Beginners
https://www.codingninjas.com/codestudio/library/modular-arithmetic
https://codeforces.com/blog/entry/72527
https://www.youtube.com/watch?v=RCq5TYMZEwg

Modular Exponentiation (Power in Modular Arithmetic)
https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/
https://www.youtube.com/watch?v=tTuWmcikE0Q

Compute n! under modulo p
https://www.geeksforgeeks.org/compute-n-under-modulo-p/

==================================================
Extras
==================================================

The Pigeonhole Principle
https://www.geeksforgeeks.org/discrete-mathematics-the-pigeonhole-principle/

Catalan Number
https://www.geeksforgeeks.org/program-nth-catalan-number/

Inclusion-Exclusion principle
https://www.geeksforgeeks.org/inclusion-exclusion-various-applications/

*/