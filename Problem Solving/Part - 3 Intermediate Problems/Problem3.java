import java.util.Scanner;

// 3. Calculate Average Of N Numbers

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int n = input.nextInt();
        long sum = 0;
        System.out.println("Enter the number :");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("Average of "+n+" numbers : "+sum/n);
        input.close();
    }
    
}
