import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q.1 Find the largest of the 3 number 

        if (a>b && a>c) {
            System.out.println("Number a is greater than b and c");
        }

        else if (b>a && b>c){
            System.out.println("Number b is greater than a and c");
        }

        else{
            System.out.println("Number c is greater than a and b");
        }
    }
}
