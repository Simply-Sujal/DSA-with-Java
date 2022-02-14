
// * * * * 
// * * * 
// * * 
// * 

public class Problem1{
    public static void main(String[] args) {
        Triangle(4, 0);
    }

    static void Triangle(int row , int coloumn){
        // base condtion 
        if(row == 0){
            return;
        }

        if(coloumn < row){
            System.out.print("*");
            Triangle(row, coloumn + 1);
        }

        else{
            System.out.println();
            Triangle(row - 1, 0);
        }
    }
}