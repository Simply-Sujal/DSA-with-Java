import java.util.Scanner;

// 8. Perimeter Of Circle

public class Problem8 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the radius of the cicle : ");
       double Radius = input.nextDouble();
       
       double perimeterofcircle = 2 * 3.14f * Radius; /* perimimete of circle is 2 pi Radius */
       System.out.println("The Perimeter of Circle is : " + perimeterofcircle);

       input.close();
    }
}
