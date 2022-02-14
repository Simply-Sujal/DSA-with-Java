import java.util.Scanner;

// 4. Calculate Discount Of Product

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Real Price : ");
        int OriginalPrice = input.nextInt();

        double percentagediscount = 0.3;

        double savings = percentagediscount * OriginalPrice;
        double Discount = OriginalPrice - savings;

        System.out.println("The Discount is : " + Discount);
        input.close();
    }
}
