import java.util.Scanner;

// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

public class Problem8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalmarks = 0;
        int count;
        System.out.println("Enter the number you want to add : ");
        count = input.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (int i = 0; i < count; i++) {
            totalmarks += input.nextInt();
        }

        System.out.println("Total marks : " + totalmarks );
        // Each subject is of 100 Marks
        int percentage = (totalmarks/(count*100))*100;

        /* Printing grade of a student using switch case statement */

        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
            }
            input.close();
        }
    }