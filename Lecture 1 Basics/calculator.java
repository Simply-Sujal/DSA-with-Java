import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from users unless or until press x or X 
        int result = 0;

        while (true) {
            // Take the operator as input    
            System.out.print("Enter the Operator : ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Take two numbers from user 
                System.out.print("Enter two number : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    result = num1 + num2;
                }

                if (op == '-') {
                    result = num1 - num2;
                }

                if (op == '*') {
                    result = num1 * num2;
                }

                if (op == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }

                if (op == '%') {
                    result = num1 % num2;
                }
            }
                else if(op == 'x' || op == 'X'){
                    break;
                }

                else{
                    System.out.print("Invalid Operation!");
                }

                System.out.println(result);
            }
            input.close();   
        }
        
    }

