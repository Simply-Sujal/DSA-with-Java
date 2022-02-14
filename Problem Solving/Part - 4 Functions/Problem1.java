import java.util.Scanner;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by users

public class Problem1{

   static int max(int a, int b , int c){
       int res = a;
       if (res < b) {
           res = b;
       }
       if (res < c) {
           res = c;
       }
       return res;
   }

   static int min(int a , int b , int c){
       int res = a;
       if (res > b) {
           res = b;
       }
       if (res > c) {
           res = c;
       }

       return res;
   }

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a , b , c;
       System.out.println("Enter three numbers : ");
       a = input.nextInt();
       b = input.nextInt();
       c = input.nextInt();
       
       int max_num = max(a, b, c);
       int min_num = min(a, b, c);

       System.out.println("The Maximum number is : " + max_num);
       System.out.println("The Minimum number is : " + min_num);

       input.close();
   }
}