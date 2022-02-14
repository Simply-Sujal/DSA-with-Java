public class Problem6 {
    public static void main(String[] args) {
        concept(5);        
    }

    static int concept(int n){
        if(n == 0){
            return 0;
        }

        System.out.println(n);
        return concept(--n);
    }
}
