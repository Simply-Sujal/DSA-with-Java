import java.util.Scanner;

// 14. Perimeter Of Rhombus = 4 * side

public class Problem14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sdie of the rhombus : ");

        double Side = input.nextDouble();
        double pofrhombus = 4 * Side;
        
        System.out.println("The Perimetere of the Rhombus is : " + pofrhombus);

        input.close();
        
    }
}
