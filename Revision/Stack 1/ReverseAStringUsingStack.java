import java.util.Stack;

public class ReverseAStringUsingStack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder st = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            st.append(curr);
        }
        return st.toString();
    }

    public static void main(String[] args) {
        String str = "Sujal";
        String ans = reverseString(str);
        System.out.println(ans);
    }
}
