import java.util.ArrayList;
import java.util.Scanner;

public class Multidimlist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialisation , it means we are creating a list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add Element
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                list.get(i).add(input.nextInt());
            }
        }
        System.out.print(list);

        input.close();
    }
}
