import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // creating an array
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        System.out.println("Physics : " + arr[0]);
        System.out.println("Chemistry : " + arr[1]);
        System.out.println("Maths : " + arr[2]);

        arr[2] = arr[2] + 1;
        System.out.println("Corrected marks in Maths : " + arr[2]);
        sc.close();
    }
}