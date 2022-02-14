import java.util.Scanner;

// 19. Volume Of Pyramid = height * width * length / 3

public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height : ");
        double Height = input.nextInt();

        System.out.println("Enter the widht : ");
        double Width = input.nextInt();

        System.out.println("Enter the length : ");
        double Length = input.nextInt();

        double VolumeofPyramid = Height * Width * Length / 3;
        System.out.println("The volume of Pyramid is : " + VolumeofPyramid);

        input.close();

    }
}
