import java.util.Scanner;

// 7. Power In Java

public class Problem7 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter any number : ");
       int number = input.nextInt();

       System.out.println("Enter the power : ");
       int p = input.nextInt();

       int power = 1;

       while (p != 0) {
           power *= number;
           p--;
       }

       System.out.print("The power of the number is : " + power);
       input.close();

    }
}
