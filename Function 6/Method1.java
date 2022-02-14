import java.util.Scanner;

public class Method1 {
   public static void main(String[] args) {
    int answer = add();  
    System.out.println("The addition is : " + answer);
    

   }

   static int add(){
    Scanner input = new Scanner(System.in);
    int num1 , num2 ;
    System.out.println("Enter the first number : ");
    num1 = input.nextInt();
    System.out.println("Enter the second number : ");
    num2 = input.nextInt();
    int add = num1 + num2;
    return add;
   }

    static void addition(){   
    Scanner input = new Scanner(System.in);
    int num1 , num2 ;
    System.out.println("Enter the first number : ");
    num1 = input.nextInt();
    System.out.println("Enter the second number : ");
    num2 = input.nextInt();
    int sum = num1 + num2;

    System.out.print("The sum of two number is : " + sum);
    input.close();
}
    
    // basic syntax to create a method

    // return type name(){
    //     body 
    // }

}
