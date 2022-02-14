public class Comparisionn{
    public static void main(String[] args) {
        String name = "Sujal";
        String nam = "Sujal";

        System.out.println(name);
        System.out.println(nam);
        System.out.println(name == nam);


        String name1 = new String("Varun");
        String name2 = new String("Varun");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2)); // equals() method only check the value 
        System.out.println(name1.charAt(1)); // charAt method gives you the the postion of character which we are looking for .
    }
}