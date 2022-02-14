import java.util.Scanner;
// 18. Find if a number is palindrome or not


public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ente any to check Palindome or not : ");
        int num = input.nextInt();
        int newnum = num;
        int rev = 0;

        while (num != 0) {
            rev = num % 10 + rev * 10;
            num /= 10;
        }
        if (newnum == rev) {
            System.out.print("The number is Palindrome");
        }
        else{
            System.out.println("The numbe is not a Plaindrome");
        }
        input.close();
    }
}
