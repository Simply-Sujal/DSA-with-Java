import java.util.Scanner;

// 22. Fibonacci Series In Java Programs

public class Problem22 {
    public static void main(String[] args) {
        // first method 
        // Scanner input = new Scanner(System.in);
        // int a = 0 , b = 1 , c,  num , i;
        // System.out.println("Enter any number that you want to iterate : ");
        // num = input.nextInt();
        // for(i = 0 ; i < num ; i++){
        // c = a + b;
        // a = b;
        // b = c;

        // System.out.println(c);
        
        // input.close();
        // }
        
        // second method 
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the number that you want to iterate : ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num) {
            int temp = b;
            b = b + a;
            a =temp;
            count++;
        }

        System.out.println(b);

        input.close();

    }
}
