import java.util.ArrayList;

public class Operatoorr{
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps : "a" + "1"
        // integer will be converted to integer that will call toString();

        System.out.println("Sujal" + new ArrayList<>());
        System.out.println("Sujal" + new Integer(71));
        System.out.println(new ArrayList<>() + " " + new Integer(45)); // there always must be one string if not then it will say error     
    }
}