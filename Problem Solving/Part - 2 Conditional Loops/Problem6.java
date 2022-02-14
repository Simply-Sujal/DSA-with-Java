import java.util.Scanner;

// 6. Area Of Rhombus

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first diagonal : ");
        double Diagonal1 = input.nextDouble();

        System.out.println("Enter the Second diagonal : ");
        double Diagonal2 = input.nextDouble();

        double areaofrhombus = (Diagonal1 * Diagonal2) / 2;
        System.out.println("The area of Rhombus is : " + areaofrhombus);

        input.close();
    }
}
