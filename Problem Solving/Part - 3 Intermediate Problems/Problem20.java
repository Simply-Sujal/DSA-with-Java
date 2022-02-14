import java.util.Scanner;

// 20. Java Program Vowel Or Consonant

public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any leter to check vowel or not : ");
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The letter is LOWERCASE");
        }

        else{
            System.out.println("The letter is UPPERCASE");
        }
        input.close();
    }
}
