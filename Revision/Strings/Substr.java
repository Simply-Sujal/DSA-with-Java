public class Substr {

    public static String SubStringg(String st, int si, int ei) {
        String newSt = "";
        for (int i = si; i < ei; i++) {
            newSt += st.charAt(i);
        }
        return newSt;
    }

    public static void main(String[] args) {
        String st = "Timilsina";
        // java has inbuild substring method
        System.out.println(st.substring(0, 5));
        // System.out.println(SubStringg(st, 0, 5));
    }
}
