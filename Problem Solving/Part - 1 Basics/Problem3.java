
// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P , R , T;
        System.out.println("Type Principle : ");
        P = input.nextInt();
        System.out.println("Type Rate : ");
        R = input.nextInt();
        System.out.println("Type Time : ");
        T = input.nextInt();

        System.out.println(P * R * T / 100 + " " + "is the simple interest");
    }
}
