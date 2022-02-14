
// *
// * * 
// * * * 
// * * * *

public class Pattern1{
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n){
        for (int rows = 1; rows <= n; rows++) {
            // for every row , run the col.
            for(int col = 1; col <= rows; col++){
                System.out.print("* ");
            }
            // when one row is printed , we need to add a new line 
            System.out.println();
        }
    }
}