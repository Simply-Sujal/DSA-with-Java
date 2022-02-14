import java.util.Scanner;



public class Problem14 {
    static String myname(){
        return new Scanner(System.in).nextLine();
    }
    static int myage(){
        return new Scanner(System.in).nextInt();
    }


    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        System.out.println("My name is : " + myname());
        System.out.println("Enter your age : ");
        System.out.println("My age is : " + myage());

        
    }
}
