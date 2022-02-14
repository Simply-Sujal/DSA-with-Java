import java.util.Scanner;

// 9. Calculate Batting Average

public class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the runs : ");
        int run = input.nextInt();
        System.out.print("Enter the matches : ");
        int matches = input.nextInt();
        System.out.print("Enter the number of not-matches : ");
        int notout = input.nextInt();

        int outmatches = matches - notout;
        double average = run / outmatches;

        System.out.println("The Batting average : " + average);

        input.close();
    }
}
