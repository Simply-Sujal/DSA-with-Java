import java.util.Scanner;

// 1. Factorial Program In Java

public class Problem1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");

        int num;
        num = input.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact *i;
        }

        System.out.println("The Factorial of " + num + "! is : " + fact);

        input.close();
    }
}