import java.util.Scanner;

// 20. Curved Surface Area Of Cylinder =  2πrh

public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double Radius = input.nextInt();

        System.out.println("Enter the height : ");
        double Height = input.nextInt();

        double csaofcylinder = 2 * 3.14f * Radius * Height;
        System.out.println("The curved surface area of cylinder is : " + csaofcylinder);

        input.close();
    }
}
