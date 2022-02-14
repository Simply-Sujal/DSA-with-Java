
// ***** 
// ***** 
// ***** 
// ***** 
// ***** 

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern2(int n){
        // first we will ran the outer loop for the number of lines or no. of rows 
        for (int row = 1; row <= n; row++) {
            // for evert row , run the col. 
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
