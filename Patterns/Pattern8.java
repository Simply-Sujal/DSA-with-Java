public class Pattern8 {
    public static void main(String[] args) {
        pattern8(4);
    }

    static void pattern8(int n){
        for(int rows = 1; rows <= 2 * n; rows++){
            int c = rows > n ? 2*n - rows : rows;

            for(int s = 0; s < n - c; s++){
                System.out.print("  ");
            }

            for(int col = c;col>=1;col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col <= c; col++){
                System.out.print(col + " ");
            }
            
            System.out.println();
        }
    }
}
