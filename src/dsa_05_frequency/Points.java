package dsa_05_frequency;

public class Points {
}

/*

For counting frequencies we can use frequency arrays and Map data structure

==============================
Use a Frequency Array when:
==============================

1. Keys are small non-negative integers or characters
Example: integers from 0 to 1000, or characters like 'a' to 'z'

2. Key range is known and small
You know the max value (max) and it’s not too large (e.g., less than 1 million)
If your max index is ≤ 10⁷, frequency arrays are fine.

3. Performance is critical (O(1) access)
Arrays give constant-time access, faster than Map

==================
Use a Map when:
==================

1. Keys can be negative or very large integers
Example: elements like -10^9 or 10^6

2. Key range is unknown or sparse
Not all numbers in the range will appear then using a large array would waste memory

3. Keys are not integers
E.g., strings, objects, or long integers

 */