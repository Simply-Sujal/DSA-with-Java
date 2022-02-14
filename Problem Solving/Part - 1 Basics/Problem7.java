import java.util.Scanner;

// 7. To calculate Fibonacci Series up to n numbers.



public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0 , b = 1 , c , num , i ;
        System.out.println("Enter any number that you want to iterate : ");
        num = input.nextInt();

        for(i = 0; i < num; i++){
            c = a + b;
            a = b;
            b = c;

            System.out.println(c);
        }



    }
}
