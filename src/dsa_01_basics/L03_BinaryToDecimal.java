package dsa_01_basics;

import java.util.Scanner;

public class L03_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        int answer = 0;
        while (n != 0) {
            int lastBit = n % 10;
            n = n / 10;
            answer = answer + (int) (lastBit * Math.pow(2, i));
            i += 1;
        }
        System.out.println(answer);
    }
}
