import java.util.*;

public class PushAtBottomOfStack {

    public static void pushAtBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(4);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        pushAtBottom(st, 4);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
