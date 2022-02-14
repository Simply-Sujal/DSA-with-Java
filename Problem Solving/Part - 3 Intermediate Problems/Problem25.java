import java.util.Scanner;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

public class Problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nsum = 0;
        int esum = 0;
        int osum = 0;
        System.out.print("Enter number : ");
        int temp = input.nextInt();

        while (temp != 0) {
            if (temp < 0) {
                nsum += temp;
            }
            if (temp > 0) {
                if (temp % 2 == 0) {
                    esum += temp;
                }
                else{
                    osum += temp;
                }
                temp = input.nextInt();
            }
            
        }
        System.out.println("Sum of negative number is : " + nsum);
        System.out.println("Sum of positive odd number is : " + esum);
        System.out.println("Sum of positive even number is : " + osum);

        input.close();
    }
}
