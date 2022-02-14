
// QST. 2  sum of a number  

public class Problem3 {
    public static void main(String[] args) {
        int ans = sum(10);
        System.out.print(ans);
    }

    static int sum(int n){
        if(n == 0){
            return 0; 
        }

        return n + sum(n - 1);
    }
}
