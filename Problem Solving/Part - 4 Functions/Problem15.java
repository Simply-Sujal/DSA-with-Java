import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int num = input.nextInt();
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == false) {
                System.out.println("The number is not a Prime");
            }
            else{
                System.out.println("The number is Prime");
            }

            input.close();
    }
}
