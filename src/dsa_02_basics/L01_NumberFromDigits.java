package dsa_02_basics;

public class L01_NumberFromDigits {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        System.out.println(buildNumber(digits));
        System.out.println(buildNumberInReverse(digits));
    }

    public static int buildNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return number;
    }

    public static int buildNumberInReverse(int[] digits) {
        int number = 0;
        int place = 1;
        for (int digit : digits) {
            number = digit * place + number;
            place = place * 10;
        }
        return number;
    }
}


/*
To generate a number from digits as they appear:

=======================================
1. In original order (left to right):
=======================================

Example: Digits 1, 2, 3 -> Number 123

ans = (ans * 10) + digit;

=======================================
2. In reverse order (right to left):
=======================================

Example: Digits 1, 2, 3 -> Number 321

ans = (digit * place) + ans;
place *= 10;

 */
