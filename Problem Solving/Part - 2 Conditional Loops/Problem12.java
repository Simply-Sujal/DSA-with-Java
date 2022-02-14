import java.util.Scanner;

// 12. Perimeter Of Square

public class Problem12 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the side of the Square : ");
       
       double Side = input.nextDouble();
       double perimeterofsquare = 4 * Side;

       System.out.println("The perimeter of the Square is : " + perimeterofsquare);

       input.close();
    }
}
