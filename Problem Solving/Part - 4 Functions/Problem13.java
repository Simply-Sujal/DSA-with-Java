import java.util.Scanner;

public class Problem13 {
    static String myname(String name){
        return name;
    }
    
    static int myage(int age){
        return age;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.next();
        System.out.println("Enter your age : ");
        int age = input.nextInt();

        System.out.println(myname(name));
        System.out.println(myage(age));

        input.close();
    }
}  
