// * 
// * * 
// * * * 
// * * * * 
// * * * 
// * * 
// *





public class Pattern5 {
    public static void main(String[] args) {
        pattern5(4);
    }

    static void pattern5(int n){
        for(int row = 0; row<2*n; row++){
            int totalColInRow = row > n ? 2 * n - row : row;
            for(int col = 0; col < totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
