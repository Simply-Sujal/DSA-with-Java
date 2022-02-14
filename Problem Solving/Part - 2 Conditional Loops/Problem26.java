import java.util.Scanner;

// 26. Take integer inputs till the user enters 0 and print the largest number from all.

public class Problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");

        int Input = 0;
        int Large = 0;
        int counter = 0;
        int Small = 0;
        
        while ((Input = input.nextInt()) != 0) {
            
            if (counter == 0) {
                Small = Large = Input;
                counter++;
            }

            if (Input > Large) {
                Large = Input;
            }

            if (Input < Small) {
                Small = Input;
            }
        }
        System.out.println(Large);
        input.close();
    }
}
