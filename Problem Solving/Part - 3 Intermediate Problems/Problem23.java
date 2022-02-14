import java.util.Scanner;

// 23. Sum Of A Digits Of Number

public class Problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = input.nextInt();
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.println("The sum of digits of number is : " + sum);
        input.close();
    }
}
