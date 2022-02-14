import java.util.Scanner;

// 25. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

public class Problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter any number : ");
         int num;
         int sum = 0;

         do {
             num = input.nextInt();
             sum = sum + num; 
         } 
         while (num != 0);
         System.out.println("Sum = " + sum); 
         input.close();
    }                
}
