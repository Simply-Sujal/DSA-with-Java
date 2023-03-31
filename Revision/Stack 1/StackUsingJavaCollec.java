import java.util.Stack;

public class StackUsingJavaCollec {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
