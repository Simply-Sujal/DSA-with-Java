public class StringCompar {
    public static void main(String[] args) {
        String st = "Sujal";
        String st1 = "Sujal";
        String st2 = new String("Sujal");

        // == is used to check when to want to see the string is equal at object level
        if (st == st1)
            System.out.println("String Equal");
        else
            System.out.println("Not Equal");

        // but when you the value is equal or not then uh should use .equals()
        if (st.equals(st2))
            System.out.println("String Equal");
        else
            System.out.println("Not Equal");
    }
}
