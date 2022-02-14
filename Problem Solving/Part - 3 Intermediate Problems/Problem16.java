import java.util.Scanner;

// 16. Find NCR and NPR using java programme
public class Problem16{
    static int fact(int num){
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f *= i;
        }
        return f;
    }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        System.out.println("Enter the value of p : ");
        int r = input.nextInt();

        if (n > r) {
            System.out.println(n+"c"+r+":" + fact(n)/fact(n-r)*fact(r));
            System.out.println(n+"p"+r+":" + fact(n)/fact(n-r));
        }
        input.close();
    }

}
    
    

