import java.util.Scanner;

// 2. Calculate The Electricity Bill 

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of KWH used : ");
        double Kwh = input.nextDouble();

        System.out.println("Enter the cost of the KWH : ");
        double Cost = input.nextDouble();

        System.out.print("Enter the number of days used : ");
        int Days = input.nextInt();

        double Bill = 0;

        if(Kwh > 0 && Cost > 0 && Days > 0){
            
            Bill = Kwh * Cost;
            Bill = Bill / Days;

            System.out.println("The electricity bill of your home is : " + Bill);
        }

        else{
            System.out.println("Input is Invalid");
        }

        input.close();


        }
}
