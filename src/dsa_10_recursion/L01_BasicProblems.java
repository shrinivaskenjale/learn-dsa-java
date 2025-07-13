package dsa_10_recursion;

public class L01_BasicProblems {

    static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        printNTimes(5);
        print1ToN(5);
        printNTo1(5);
        System.out.println(factorial(5));
        System.out.println(powerOf2(5));
        System.out.println();
        System.out.println(nthFibonacci(8));
        sayDigits(4520);
        System.out.println();
    }

    // Time: O(n)
    // Space: O(n)
    static void printNTimes(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Shri");
        printNTimes(n - 1);
    }

    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    static void printNTo1(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n + " ");
        printNTo1(n - 1);
    }

    static int factorial(int n) {
        // Recurrence relation f(n) = n * f(n)
        // base case
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int powerOf2(int n) {
        if (n == 0) {
            return 1;
        }

        return 2 * powerOf2(n - 1);
    }


    static int nthFibonacci(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        // recurrence relation f(n)=f(n-1)+f(n-2)
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    static void sayDigits(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        sayDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }
}
