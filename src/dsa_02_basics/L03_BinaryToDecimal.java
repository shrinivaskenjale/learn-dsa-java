package dsa_02_basics;

public class L03_BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 11001;
        System.out.println(getDecimal(binary));
    }

    public static int getDecimal(int binary) {
        int ans = 0;
        int multiplier = 1;
        while (binary > 0) {
            int lastBit = binary % 10;
            binary = binary / 10;
            ans = lastBit * multiplier + ans;
            multiplier = multiplier * 2;
        }
        return ans;
    }
}
