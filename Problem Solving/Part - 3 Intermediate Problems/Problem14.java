import java.util.Scanner;

// 14. Sum Of N Numbers

public class Problem14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("How many number you want to enter : ");
        int n = input.nextInt();
        
        int sum = 0;

        System.out.println("Enter the number : ");

        for (int i = 0; i < n; i++) {
            int add = input.nextInt();
            sum = sum + add;
        }

        System.out.println("The average of a number : " + sum);
        input.close();
    }
}
