public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            st.append(ch);
        }

        // System.out.println(st);
        // System.out.println(st.length());

        StringBuilder st1 = new StringBuilder("a");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            st1.append(ch);
        }

        System.out.println(st1);
        System.out.println(st1.length());
    }
}
