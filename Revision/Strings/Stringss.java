import java.util.*;

public class Stringss {

    // printing all the characters from the string
    public static void PrintChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char ch[] = { 'a', 'b', 'c', 'd' };
        // String st = "Sujal";
        // String st1 = new String("Hey my name is sujal");

        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // this will only take the single word
        // System.out.println(name);
        // String name1 = sc.nextLine(); // this will take full line
        // System.out.print(name1);

        String s = "Sujal Kumar Timilsina";
        System.out.println(s.length());

        // concatination
        String firstName = "Sujal";
        String lastName = "Timilsina";
        String name = firstName + lastName;
        // System.out.println(name);
        // System.out.println(name.charAt(2));
        PrintChar(name);
    }
}