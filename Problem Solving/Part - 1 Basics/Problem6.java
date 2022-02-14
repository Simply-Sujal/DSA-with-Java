import java.util.Scanner;

// 6. Input currency in rupees and output in USD.

public class Problem6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inr , usd;
    System.out.println("Enter the amount : ");
    inr = input.nextInt();
    
    usd = 75 * inr;

    System.out.println("The USD is : " + " " + usd);
    }
}
