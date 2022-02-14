import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year : " + year);
                }
                else{
                    System.out.print("Not a leap hour");
                }
            }
                else{
                    System.out.print("Leap hour");
            }
            }
                else{
                   System.out.print("Not a leap hour");
            }
                input.close();
    }
}
