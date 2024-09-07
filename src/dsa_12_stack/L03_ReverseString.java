package dsa_12_stack;

import java.util.Stack;

public class L03_ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Shrinivas Kenjale"));
    }

    static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        while (!s.isEmpty()) {
            ans.append(s.pop());
        }

        return ans.toString();
    }
}

// Stack is last in first out ds.
// If we put chars of string one by one then last character that we put in will
// be removed first. We can use this to build reversed string.

// time: O(n)
// space: O(n)