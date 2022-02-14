import java.util.Scanner;

// 24. Input a number and print all the factors of that number (use loops).

public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");

        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0) {
                
                System.out.println("The factors are : " + " " + i);
            }
        }
        input.close();
    }
}
