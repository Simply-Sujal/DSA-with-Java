import java.util.Scanner;

// 8. To find out whether the given String is Palindrome or not.

public class Problem8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
           System.out.println("Enter a string : ");

           String str ;
           str = input.next();
           String org_str = str;

           String rev = " ";

           int len = str.length();

           for(int i = len - 1; i >= 0; i--){
              rev = rev + str.charAt(i);
           }

           if (org_str.equals(rev)) {
               System.out.println("This is a Plaindrome Number");
           }

           else{
               System.out.println("This is not a palindrome number");
           }
    }
}
