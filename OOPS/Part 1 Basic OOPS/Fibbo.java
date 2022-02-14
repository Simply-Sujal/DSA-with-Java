import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c;
        int num = input.nextInt();

        for(int i=0;i<num;i++){
            c = a+b;
            a = b;
            b = c;

            // System.out.println(a);
            // System.out.println(b);
            System.out.println(c);
        }
        input.close();
    }
}
