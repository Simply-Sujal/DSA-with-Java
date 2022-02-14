import java.util.Scanner;
// 2. Define a program to find out whether a given number is even or odd.
public class Problem2 {
    static boolean check(int a){
           return (a % 2 == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        System.out.println("Enter any number to check even or odd : ");
        a = input.nextInt();

        if (check(a)) {
            System.out.println("The number is Even");
        }

        else{
            System.out.println("The number is Odd");
        }
        input.close();
    }

    }

