import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Arrays of Object
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));

        str[2] = "boy";
        System.out.println(Arrays.toString(str));


        input.close();
    }
}
