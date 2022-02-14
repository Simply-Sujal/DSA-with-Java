import java.util.Scanner;

// Traversal in Array

public class Arraysbasics1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       int[] a = new int[50];
       int size;
       System.out.println("Enter size of array : ");
       size = input.nextInt();  //if we write the size of an array more than the actual one then i will say lenght excess bound
       if (size > 50) {
           System.out.println("Overflow Condition");
       }
       else{
       System.out.println("Enter elements of array : ");

       for (int i = 0; i < size; i++) {
        a[i] = input.nextInt();
       }

       System.out.println("Elements in array are : ");

       for (int i = 0; i < size; i++) {
           System.out.print(a[i] + " ");
       }
    }
       input.close();

    }
}
