import java.util.Scanner;
// 3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
 
public class Problem3 {
    static boolean vote(int a){
        return (a >= 18);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        System.out.println("Enter your age : ");
        a = input.nextInt();

        if (vote(a)) {
            System.out.print("You are eligible to vote");
        }

        else{
            System.out.println("Sorry! You are not eligible for vote");
        }

        input.close();
    }
}
