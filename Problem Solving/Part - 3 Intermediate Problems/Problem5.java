import java.util.Scanner;

// 5. Calculate Distance Between Two Points

public class Problem5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x2 : ");
        int X2 = input.nextInt();

        System.out.println("Enter the value of x1 : ");
        int X1 = input.nextInt();

        int  difference1 = (X2 - X1)^2;
        
        System.out.println("Enter the value of Y2 : ");
        int Y2 = input.nextInt();

        System.out.println("Enter the value of Y1 : ");
        int Y1 = input.nextInt();

        int  difference2 = (Y2 - Y1)^2;

        int dbettwopoints = (int) Math.sqrt(difference1 + difference2);

        System.out.println("The distance between two point is : " + dbettwopoints);  
        
        input.close();
    }
}