import java.util.Scanner;

// 9. To find Armstrong Number between two given number.

public class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter any number to check whether it is ARMSTRONG no. or not : ");
        n = input.nextInt();
        int temp = n;
        int r;
        int sum = 0; 

        while(n > 0){
        r = n % 10;
        n = n / 10;
        sum = sum + r * r * r;
        }

        if (temp == sum) {
            System.out.println("It is an ARMSTRONG number");
        }

        else{
            System.out.println("It is not an ARMSTRONG number");
        }
        input.close();
    }
}
