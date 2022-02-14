import java.util.Scanner;

// 10. Perimeter Of Parallelogram = 2(a + b) where a = side and b = base

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the parallelogram : ");
        double Side = input.nextDouble();

        System.out.println("Enter the base of the parallelogram : ");
        double Base = input.nextDouble();

        double pofparall = 2 * (Side + Base);

        System.out.println("The perimeter of Parallelogram is : " + pofparall);

        input.close();
    }
}
