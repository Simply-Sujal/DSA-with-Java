import java.util.Scanner;

// 13. Addition Of Two Numbers

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.println("Enter the Second number : ");
        int num2 = input.nextInt();

        int addition = (num1 + num2);

        System.out.println("The addition of two number is : " + addition);
        input.close();
    }
}
