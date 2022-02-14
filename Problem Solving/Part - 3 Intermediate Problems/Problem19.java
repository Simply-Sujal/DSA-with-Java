import java.util.Scanner;

// 19. HCF Of Two Numbers Program

public class Problem19 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the First number : ");
       int a = input.nextInt();
       System.out.println("Enter the Second number : ");
       int b = input.nextInt();
       
       int HCF = 1;

       for (int i = 1; i<=a || i<=b; i++) {
           if (a % i == 0 && b % i == 0) {
               HCF = i;
           }
       }

       int LCM = (a * b) / HCF; /* this is the only line require to calculation for lcm*/
       System.out.println("The HCF of " + a + " and " + b + " is : " + HCF);
       System.out.println("The LCM of " + a + " and " + b + " is : " + LCM);

       input.close();
    }
}
