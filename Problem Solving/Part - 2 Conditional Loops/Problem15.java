import java.util.Scanner;

// 15. Volume Of Cone Java Program = pi r^2 h/3


public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double Radius = input.nextDouble();

        System.out.println("Enter the height : ");
        double Height = input.nextDouble();

        double Volumeofcone = 3.14 * Radius * Radius * (Height / 3);

        System.out.println("The volume of the Cone is : " + Volumeofcone);

        input.close();
    }
}
