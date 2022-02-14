
// QST. 2  product of a digits of a number  

public class Problem5 {
    public static void main(String[] args) {
        int ans = product(1342);
        System.out.print(ans);
    }

    static int product(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * product(n/10);
    }
}
