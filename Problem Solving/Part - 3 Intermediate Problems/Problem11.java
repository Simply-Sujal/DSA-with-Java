import java.util.Scanner;
// 11. Compound Interest Java Program


public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle : ");
        int p = input.nextInt();
        System.out.print("Enter the rate : ");
        int rate = input.nextInt();
        System.out.print("Enter the time : ");
        int time = input.nextInt();

        System.out.println("The CI is : " + compoundInterest(p, rate, time));
        input.close();

    }

    static double compoundInterest(double p,double rate,double time) {
        return p * Math.pow((1 + rate/100),time) - p;
    }
}
