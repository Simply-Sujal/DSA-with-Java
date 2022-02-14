import java.util.Scanner;

//    6.  Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class Problem6 {
      static double circum(double radius){
          double circumeference = 2 * 3.14 * radius;
          return circumeference;
      }

      static double area(double radius){
          double areaofcircle = 3.14 * (radius*radius);
          return areaofcircle;
      }
      
    
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int radius;
          System.out.println("Enter the radius of circumference : ");
          radius = (int) input.nextDouble();

          double circumofcircle = circum(radius);
          double areaofcirc = area(radius);

          System.out.println("The circumeference of circle is : " + circumofcircle);
          System.out.println("The area of circle of is : " + areaofcirc);

          input.close();

      }
}
