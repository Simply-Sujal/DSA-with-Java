import java.util.Scanner;

// 3. Area Of Rectangle Program

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length : ");
        double Length = input.nextInt();
        System.out.println("Enter the breadth : ");
        double Breadth = input.nextInt();
    
        System.out.println("The area of rectangle is : " + (Length * Breadth));

        input.close();

    }
}
