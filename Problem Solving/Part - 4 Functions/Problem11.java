import java.util.Scanner;

// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


    }

    static boolean pythogoreanTriplet(int a , int b , int c){

      int max = a;
      if (b >= max) {
          max = b;
      }
      if (c >= max) {
          max = c;
      }

      if (max == a) {
         boolean flag = ((b*b + c*c) = a*a));
      }
         System.out.println(flag);
      }
    }

