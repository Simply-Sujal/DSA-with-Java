import java.util.Scanner;

// 7. Area Of Equilateral Triangle

public class Problem7 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the side of the eq. triangle : ");  

      double side = input.nextDouble();

      double areaofeqTriangle = 0.43 * side * side; /* area of equilateral triangle is : (root3 / 4 * side^2) and root3 / 4 = 0.43 */ 
      System.out.println("The area of Equilateral triangle is : " + areaofeqTriangle);

      input.close();
    }
}
