
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // array of Primitives 
        int[] arr = new int[5];
        arr[0] = 55;
        arr[1] = 99;
        arr[2] = 1;
        arr[3] = 9;
        arr[4] = 373;
        //output [55,99,1,9,373]
        // output [373]
        System.out.println(arr[0] + " "+ arr[1] + " "+ arr[2] + " " + arr[3] + " " + arr[4]);
        System.out.println(arr[4]);


        // Input using for loop 
        for (int i = 0; i < arr.length; i++) {  //arr.length is used to take the length of an array instead of declaring its space
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr)); //best way to print an array 

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        input.close();
    }
}