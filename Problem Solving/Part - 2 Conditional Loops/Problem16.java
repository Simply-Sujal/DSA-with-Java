import java.util.Scanner;

// 16. Volume Of Prism = V = Bh (B = base area , h = height)

public class Problem16 {
    public static void main(String[] args) {
        // volume of prism = V = Bh (B = base area , h = height)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the prism : ");
        double Length = input.nextDouble();

        System.out.println("Enter the breadth of the prism : ");
        double Breadth = input.nextDouble();

        System.out.println("Enter the height of the prism : ");
        double Height = input.nextDouble();

        double volumeofprism = Length * Breadth * Height;
        System.out.println("The volume of the Prism is : " + volumeofprism);

        input.close();
    }
}
