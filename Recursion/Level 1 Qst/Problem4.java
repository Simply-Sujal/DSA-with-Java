
// QST. 2  sum of a digits of a number  

public class Problem4 {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println("The sum of a digits of a number is : " + ans);
    }

    static int sum(int n){
        if (n == 0) {
            return 0;
        }

        return (n%10) + sum(n / 10);
    }
}
