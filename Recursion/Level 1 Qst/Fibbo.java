
// Fibbonacci with Recursion 

public class Fibbo{
    public static void main(String[] args) {
        System.out.print(fibbo(10));
    }

    static int fibbo(int n){

        // base condition 
        if(n < 2){
            return n;
        }
        return fibbo(n-1) + fibbo(n-2);

    }
}