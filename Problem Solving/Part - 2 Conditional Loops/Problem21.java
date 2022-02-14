import java.util.Scanner;

// 21. Total Surface Area Of Cube = 6a^2 where a = side lenght

public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side lenght : ");
        double sidelength = input.nextInt();

        double tsaofcube = 6 * sidelength * sidelength;
        System.out.println("The total surface area of cube is : " + tsaofcube);

        input.close();

    }
}
