
// 24. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

public class Problem24 {
    public static void main(String[] args) {
        int august = 31;
        int count = 0;
        for (int i = 1; i <= august; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.print("No of days = " + count);
    }
}