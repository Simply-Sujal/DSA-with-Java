// for a given string convert each the first letter of each wiord to uppercase

public class FirstLeterToUpper {
    // TC : O(1)
    public static String upperLeter(String str) {
        StringBuilder st = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        st.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                st.append(str.charAt(i));
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));
            } else {
                st.append(str.charAt(i));
            }
        }
        return st.toString();

    }

    public static void main(String[] args) {
        String st = "hello world i am there for you";
        System.out.println(upperLeter(st));
    }
}
