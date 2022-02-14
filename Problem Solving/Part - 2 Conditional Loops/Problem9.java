import java.util.Scanner;

// 9. Perimeter Of Equilateral Triangle

public class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the eq. triangle : ");

        double Side = input.nextDouble();
        double perimeterofeqtriangle = 3 * Side ;
        System.out.println("The perimeter of euilateral triangle is : " + perimeterofeqtriangle);

        input.close();
    }
}
