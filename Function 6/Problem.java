import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        // int num = 6;
        // System.out.println(Math.sqrt(num));

        System.out.println("Enter any number to check prime or not : ");
        int num = input.nextInt();

        int c = 2;
        while (num > Math.sqrt(c)) {
            if (num % 2 == 0) {
                System.out.println("The number is not Prime");
                break;
            }
            c = c + 1;
        }
            System.out.println("The number is prime"); 
        
        input.close();
    }
}
