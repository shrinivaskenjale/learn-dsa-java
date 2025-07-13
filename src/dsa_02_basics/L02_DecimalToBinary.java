package dsa_02_basics;


public class L02_DecimalToBinary {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(getBinary(n));
    }

    public static int getBinary(int n) {
        int ans = 0;
        int place = 1;
        while (n != 0) {
            int lastBit = n & 1;
            n = n >>> 1;
            ans = lastBit * place + ans;
            place *= 10;
        }
        return ans;
    }
}

/*
===========
Solution
===========

1. From binary representation of number, extract last bits one by one.
2. We need to create a number in reverse order of stream of bits.

 */