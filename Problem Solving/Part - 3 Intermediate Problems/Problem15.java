import java.util.Scanner;

// 15. Armstrong Number In Java

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = input.nextInt();
        int sum = 0;
        int temp = num;

        
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10; 
        }

        if (temp == sum) {
            System.out.println("The number is an ARMSTRONG number");
        }

        else{
            System.out.print("This is not an ARMSTRONG number");
        }
        input.close();
    }
}
