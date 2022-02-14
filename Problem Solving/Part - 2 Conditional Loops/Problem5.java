import java.util.Scanner;

// 5. Area Of Parallelogram

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base : ");
        double Base = input.nextDouble();

        System.out.println("Enter the height : ");
        double Height = input.nextDouble();

        double areaofparallelogram = Base * Height;

        System.out.println("The area of parallelogram is : " + areaofparallelogram);
        input.close();
    }
}
