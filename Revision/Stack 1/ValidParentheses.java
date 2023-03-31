import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (str.isEmpty() || st.pop() != c)
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(])";
        System.out.println(isValid(str));
    }
}
