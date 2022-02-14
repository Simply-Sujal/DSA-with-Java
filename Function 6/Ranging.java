
import java.util.Scanner;  
public class Ranging 
{  
   public static void main(String[] args) 
   {  
       Scanner input = new Scanner(System.in);  
       System.out.print("Enter the first number : ");  
       int initial_num = input.nextInt(); // initial_num will take the first number   
       System.out.print("Enter the second number : ");  
       int final_num = input.nextInt();  // final_num will take take the range upto which you want prime number right .
       System.out.println("List of prime numbers between " + initial_num + " and " + final_num);  
       for (int i = initial_num; i <= final_num; i++)  // this loop will check from intial num to final num whether the number in between are prime or not , got it 
	   {  
           if (isPrime(i)) // here i called isprime function and that isprime function will tell us that i is prime or not or it will print i if number is found prime .
		   {  
               System.out.println(i);  // here i printed the prime no.
           }  
       }  
       input.close();
   }  
    static boolean isPrime(int n)  // am returning boolean value
   {  
       if (n <= 1)  // this means 0 and 1 cant be take to check prime right coz both the numbers are neither prime nor composite ok !!!
	   {  
           return false;  // so i retured false if the number entered is less than 1 or equal to 1 got it
       }  
       for (int i = 2; i <= Math.sqrt(n); i++)  // math.sqrt() islia kyuki optimize krne ka lia complexity ko reduce karne k lia , sham mai i will explain ok bht sundr concept ha ek , chota sa ha bt achaa ha 
	   {  
           if (n % i == 0) 
		   {  
               return false;  
           }  
       }  
       return true;  
   }  
}  

