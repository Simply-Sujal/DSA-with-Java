import java.util.Scanner;

// 8. Calculate Depreciation of Value

public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long amount , deppercent , years , temp;
        System.out.print("Enter the amount : ");
        amount = input.nextLong();
        System.out.print("Enter the deppercent : ");
        deppercent = input.nextLong();
        System.out.print("Enter the years : ");
        years = input.nextLong();

        temp = amount;
        for (int i = 0; i < years; i++) {
            temp = ((100-deppercent)*temp)/100;
        }
        System.out.print("After derpreciation : " + temp);
        input.close();
    }
}
