import java.util.Scanner;

// 23. Subtract the Product and Sum of Digits of an Integer
/*let say you entered any number like 534 then multiply all three numbers 5 * 3 * 4 and add 5 + 3 + 4 
then as a return product - addition*/

public class Problem23{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int Product = 1;

        while (n > 0) {
            int digits = n % 10;
            sum += digits;
            Product *= digits;
            n = n/10;
        }
     
        System.out.println(Product - sum);

        input.close();
    }
    
  
}