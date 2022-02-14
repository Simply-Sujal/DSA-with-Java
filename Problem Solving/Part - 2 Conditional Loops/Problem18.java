import java.util.Scanner;

// 18. Volume Of Sphere = 4/3 PI r^3

public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double Radius = input.nextDouble();

        double volumeofsphere = 1.33f * 3.14f * Radius * Radius * Radius;
        System.out.print("The volume of sphere is : " + volumeofsphere);

        input.close();
    }
}
