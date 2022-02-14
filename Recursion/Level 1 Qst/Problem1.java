
// Qst. 1 print 1 to n without using loop. 

public class Problem1 {
    public static void main(String[] args) {
        fun(10);
    }

    static void fun(int n){
        if (n == 0) {
            return;
        }

        System.out.println(n); // 5 4 3 2 1
        fun(n - 1);
        // System.out.println(n);  // 1 2 3 4 5
    }
}
