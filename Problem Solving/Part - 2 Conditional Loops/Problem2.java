import java.util.Scanner;

// 2. Area Of Triangle

public class Problem2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Base of traingle : ");
    int base = input.nextInt();
    System.out.println("Enter the Altitude of triangle : ");
    int altitude = input.nextInt();
    
    float areaoftriangle = 0.5f * base * altitude;
    System.out.println("The area of triangle is : " + areaoftriangle );
    
    input.close();
    }
}
