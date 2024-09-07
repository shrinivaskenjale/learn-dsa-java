package dsa_00_practice;

public class Main {

    public static void main(String[] args) {
        boolean val = solve("", 0, "aryan");
        System.out.println(val);
    }

    static boolean solve(String ans, int i, String target) {
        if (ans.equals(target)) {
            System.out.println(ans);
            return true;
        }
        if (i == target.length()) {
            System.out.println(ans);
            return false;
        }

        for (int j = 0; j < 26; j++) {
            char currentChar = (char) ('a' + j);

            boolean found = solve(ans + currentChar, i + 1, target);
            if (found) {
                return true;
            }
        }

        for (int j = 0; j < 10; j++) {
            String currentChar = String.valueOf(j);
            boolean found = solve(ans + currentChar, i + 1, target);
            if (found) {
                return true;
            }
        }
        return false;
    }
}
