import java.util.Scanner;

// 17 Reverse A String In Java

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any string that you want to revrese : ");
        String name = input.next();
        String rev = " ";
        
        for (int i = name.length() - 1 ; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        System.out.println("The reverse of string " + name + " is : " + rev);
        input.close();
    }
}
