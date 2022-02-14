import java.util.Scanner;

// 12. Calculate Average Marks

public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks you want to add : ");
        double n = input.nextDouble();
        int sum = 0;
        System.out.println("Enter the marks : ");

        for (int i = 0; i < n ; i++) {
            double num = input.nextDouble();
            sum = (int) (sum + num);
        }

        System.out.println("The average of your marks is : " + sum / n);
        input.close();
    }
}
