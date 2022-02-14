import java.util.Scanner;

// 1. Area Of Circle Java Program

public class Problem1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int radius;
        radius = input.nextInt();
        float pi = 3.14f;

        float areaofcircle = pi * radius * radius;

        System.out.println("The area of circle is : " + areaofcircle);

        input.close();
    }
    
}