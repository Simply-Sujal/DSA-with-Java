import java.util.Scanner;

// In this qst. we have to find out the n th fibonnaci number 
// Recurence realtion -> f(n) = f(n-1) + f(n-2);
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any number : ");
        int num = input.nextInt();
        int ans = Fibbo(num);
        System.out.println("The fibbonacci of number n is : " + ans);
        input.close();
    }
    public static int Fibbo(int n){
        // base case 
        if(n<=2){
            return 1;
        }
        // int last = Fibbo(n-1);
        // int slast = Fibbo(n-2);
        return Fibbo(n - 1) + Fibbo(n - 2);
    } 
}
