import java.util.Scanner;

// Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Problem10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any number to check palindrome or not : ");
        int num = input.nextInt();
        checkPalindrome(num);

        input.close();
    }

    static void checkPalindrome(int num){
        int temp = num;
        int rev = 0;
        while (num != 0) {
            rev = num % 10 + rev * 10;
            num = num/10;
        }

        if (temp == rev) {
            System.out.println("The number is Plaindrom");
        }

        else{
            System.out.println("The number is not a Palindrome");
        }

    }

}


