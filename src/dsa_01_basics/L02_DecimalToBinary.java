package dsa_01_basics;

import java.util.Scanner;

// If last bit of no. is 1 then it is odd else if it is 0 then even.

// num&1 gives last bit of the binary representation of number(like n%10)
// num&1 = 1 => odd 
// num&1 = 0 => even 
// num>>>1 gives number after removing last bit of binary representation(like n/10)

// To generate a number from digits as they appear (initialize ans to 0) 
// 1) in order => ans = (ans * 10) + digit
// 1,2,3 => 123
// 2) in reverse order => ans = (digit * 10^i) + ans  .... i =0,1,2,3.....
// 1,2,3 => 321

public class L02_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // From binary representation of number, extract last bits one by one.
        // We need to create a number in reverse order of stream of bits.
        int i = 0;
        int ans = 0;
        while (n != 0) {
            int lastBit = n & 1;
            n = n >>> 1;
            ans = (int) ((lastBit * Math.pow(10, i)) + ans);
            i += 1;
        }
        System.out.println(ans);
    }
}
