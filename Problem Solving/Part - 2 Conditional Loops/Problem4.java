import java.util.Scanner;

// 4. Area Of Isosceles Triangle

public class Problem4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base : ");
    double Base = input.nextDouble();     
    
    System.out.println("Enter the height : ");
    double Height = input.nextDouble();

    double area = (Base * Height) / 2;
    
    System.out.println("The area of Isosceles Triabgle : " + area);

    input.close();
    }
}
