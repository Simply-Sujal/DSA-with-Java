import java.util.Scanner;

// 5. Take 2 numbers as input and print the largest number.



public class Problem5 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int a , b;
     System.out.println("Enter First number : ");
     a = input.nextInt();
     System.out.println("Enter second number : ");
     b = input.nextInt();
     
     if (a >= b) {
     System.out.println("a is greater than b");         
     }

     else{
     System.out.println("b is greater than a");
     }
    }
}
