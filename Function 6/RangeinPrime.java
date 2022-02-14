import java.util.Scanner;



public class RangeinPrime {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any two number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int ans = Range(num1,num2);
        System.out.println(ans);
        
        input.close();

    }

    static int Range(int num1,int num2){  // i gave the different name to variable num1 = a and num2 = b , you can change name and it will refer to same variable inside main .
        int a = 0;
        while (num1 <= num2) {
            
            a = 0;
            for (int i = 2; i < num1/2; i++) {
                if(num1 % 2 == 0){
                    a = 1;
                    break;
                }
            }
            if (a == 0) {
                System.out.println(num1 + " is a prime number.");
            }
            num1++;
        }
        return a;
    }
}
