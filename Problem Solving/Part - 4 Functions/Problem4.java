import java.util.Scanner;

public class Problem4 {
    static int sum(int a , int b){
       int sum = a + b;
       return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the first number : ");
        a = input.nextInt();
        System.out.println("Enter the second number : ");
        b = input.nextInt();

        int addition = sum(a, b);

        System.out.println("The addition of two number is : " + addition);

        input.close();
    }
}
