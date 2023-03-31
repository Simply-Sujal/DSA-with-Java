public class StringCompression {
    // with the help of stringBuilder datastructure
    public static String StringComp(String str) {
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            st.append(str.charAt(i));
            if (count > 1) {
                st.append(count.toString());
            }
        }
        return st.toString();
    }

    // Normal approach
    public static String Comp1(String str) {
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            st += str.charAt(i);
            if (count > 1) {
                st += count.toString(i);
            }
        }
        return st;
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdd";
        String str1 = "abcd";
        System.out.println(StringComp(str));
        System.out.println(StringComp(str1));
        // System.out.println(Comp1(str));
    }
}
