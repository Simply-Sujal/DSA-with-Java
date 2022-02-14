
// *      
// **     
// ***    
// ****   
// ***** 

public class Problem2 {
    public static void main(String[] args) {
        Triangle2(7, 0);
    }

    static void Triangle2(int row, int col){
        // base condition
        if(row == 0){
            return;
        }

        if (col < row) {
            Triangle2(row, col + 1);
            System.out.print("*");
        }
        else{
            Triangle2(row - 1, 0);
            System.out.println();
        }
    }
}
