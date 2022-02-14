import java.util.Scanner;

public class prob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = input.nextInt();
        int temp = 0;

        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                temp = temp + 1;
            }
        }

        if (temp > 0) {
            System.out.println("Number is not Prime");
        }

        else{
            System.out.println("Number is Purily Prime");
        }

        input.close();
    }
}
