package dsa_01_basics;

import java.util.Scanner;

public class L01_AsciiCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charCode = (int) sc.next().charAt(0);
        // System.out.println(charCode);
        // System.out.println((int) 'A');
        // System.out.println((int) 'Z');
        // System.out.println((int) 'a');
        // System.out.println((int) 'z');
        // System.out.println((int) '0');
        // System.out.println((int) '9');

        if (charCode >= 65 && charCode <= 90) {
            System.out.println("capital letter");
        } else if (charCode >= 97 && charCode <= 122) {
            System.out.println("small letter");
        } else if (charCode >= 48 && charCode <= 57) {
            System.out.println("digit");
        }

        sc.close();
    }
}

// We can directly compare characters >, <, == in java.