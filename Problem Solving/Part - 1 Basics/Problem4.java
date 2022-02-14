import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Problem4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a , b;
    System.out.println("Enter First number : ");
    a = input.nextDouble();
    System.out.println("Enter Second number : ");
    b = input.nextDouble();
    
    System.out.println("Enter any of the operator + , - , * , / : ");
    String op = input.next();
    double result = 0;
    if (op.equals("+")) {
        result = a + b;
    }

    else if(op.equals("-")){
        result = a - b;
    }

    else if(op.equals("*")){
        result = a * b;
    }
    
    else if(op.equals("/")){
        result = a / b;
    }

    System.out.println("The result is : " + result);

    }
}