import java.util.ArrayList;
import java.util.Scanner;

public class Arrayy7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> mynum = new ArrayList<>();

        //Input
        for (int i = 0; i < 5; i++) {
            mynum.add(input.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(mynum.get(i)); // Pass index here , mynum[Index] syntax will not work here 
        }

        // System.out.println(mynum);

        input.close();
    }
}
