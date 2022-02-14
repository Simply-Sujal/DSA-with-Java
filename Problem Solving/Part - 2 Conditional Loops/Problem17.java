import java.util.Scanner;

// 17. Volume Of Cylinder = pi r^2 h

public class Problem17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double Radius = input.nextDouble();

        System.out.println("Enter the height : ");
        double Height = input.nextDouble();

        double volumeofcylinder = 3.14 * Radius * Radius * Height;
        System.out.println("The volume of Cylinder is : " + volumeofcylinder);

        input.close();
    }
}
