package dsa_01_basics;

public class L04_OddEven {
    static String oddEven(int a) {
        if ((a & 1) == 1) { // or (a%2)==1
            return "odd";
        } else {
            return "even";
        }
    }

    public static void main(String[] args) {
        System.out.println(oddEven(0));
        System.out.println(oddEven(8));
        System.out.println(oddEven(5));
        System.out.println(oddEven(-8));
        System.out.println(oddEven(-5));
    }
}
