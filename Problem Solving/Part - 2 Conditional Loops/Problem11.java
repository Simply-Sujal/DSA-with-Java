import java.util.Scanner;

// 11. Perimeter Of Rectangle = 2(length + Breadth)

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double Length = input.nextDouble();

        System.out.println("Enter the width of the rectangle : ");
        double Breadth = input.nextDouble();

        double pofrectangle = 2 * (Length + Breadth);
        System.out.println("The Perimeter of the Rectangle is : " + pofrectangle);

        input.close();
    }
}
