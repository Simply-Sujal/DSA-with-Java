import java.util.Scanner;

// 1. Write a program to print whether a number is even or odd, also take input.

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        System.out.println("Enter any number to check wheter the no. is prime or not : ");
        a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("The number is EVEN number");
        }

        else{
            System.out.println("The number is ODD number");
        }
    }
}