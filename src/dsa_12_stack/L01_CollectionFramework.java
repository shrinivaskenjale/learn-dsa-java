package dsa_12_stack;

import java.util.Stack;

public class L01_CollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // push
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // size
        System.out.println(st.size());

        // peek
        System.out.println(st.peek());

        // pop
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.pop());

        // isEmpty
        System.out.println(st.isEmpty());
    }
}
