import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = { 3, 6, 4, 8, 5 };
        for (int i = 0; i < 5; i++) {
            st.push(arr[i]);
        }

        while (st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
