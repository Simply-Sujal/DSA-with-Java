import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = input.nextInt();

    int tempsol = binarySearch(num);
    System.out.println("Answe is : " + morePrecision(num, 3, tempsol));
    
    input.close();
    }

    static int binarySearch(int num){
        int start = 0;
        int end = num;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            int square = mid * mid;

            if (square == num) {
                return mid;
            }
            
            if (square < num) {
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    static double morePrecision(int num , int precision , int tempsol){
        double factor = 1;
        double ans = tempsol;

        for (int i = 0; i < 3; i++) {
            factor = factor / 10;

            for(Double j = ans;j*j < num;j = j + factor ){
                ans = j;
            }
        }
        return ans;
    }
}
