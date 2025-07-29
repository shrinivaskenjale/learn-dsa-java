package dsa_02_basics;

public class Points {

}

/*

=================
Tips
=================

Avoid nested conditional checks.

Always test example test cases 1 by 1 manually.

For repetitive operations of multiplication:
- Take initialization value as 1.
- e.g., power, factorial

For repetitive operations of addition:
- Take initialization value as 0.
- e.g., addition of n numbers, fibonacci

If a loop variable is modified multiple times or not updated as the final step inside
the loop, ensure the loop condition is validated after each modification, except the
last one.

Be cautious with addition and multiplication, as they can lead to integer overflow.
Subtraction and division, however, typically do not cause overflow—though division by
zero must still be handled.

If the last bit of an integer is 1, it is odd; if it is 0, it is even.

======================
Operator tricks
======================

(n % 10) returns the last digit of an integer.

(n / 10) returns the integer after removing its last digit.

(n >> 1) is equivalent to (n / 2) for positive integers, but it's more efficient.

(n << 1) is equivalent to (n * 2) for both positive and negative integers, but it's
more efficient.

To toggle a value of variable between 0 and 1, you can use the expression:
=> 1-x
=> x^1 (slightly faster)

(n & 1) and (n % 2) both return 1 if n is odd, and 0 if n is even.
(n & 1) is more efficient.

(n & 1) returns the last bit (the least significant bit) of the binary representation
of an integer.

(n >>> 1) removes the last bit of the binary representation and fills a 0 on the left.

n ^ n = 0

n ^ 0 = n

=========================
Number ranges
=========================

Remember approx ranges in terms of power of 10.

byte => ±10²
short => ±3 × 10⁴
int => ±2 × 10⁹
long => ±9 × 10¹⁸

===========================
Default values of fields
===========================

byte => 0
short => 0
int => 0
long => 0L
float => 0.0f
double => 0.0d
char => '\u0000'
String (or any object) => null
boolean => false


=====================================
Min/Max between 2 or more variables
=====================================

2 => Math.min(a,b)
3 => Math.min(a,Math.min(b, c))
4 => Math.min(Math.min(a,b),Math.min(c,d))


========================================
Modulo operator with negative numbers
========================================

https://stackoverflow.com/questions/4412179/best-way-to-make-javas-modulus-behave-like-it-should-with-negative-numbers/4412200#4412200




 */