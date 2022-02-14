import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        
        //Practise Problem 2
        // Write a program to find out whether a given integer is present in array or not ?

       ArrayList <Integer> numbercheck = new ArrayList<>();

       numbercheck.add(565);
       numbercheck.add(1);
       numbercheck.add(34);
       numbercheck.add(123);
       numbercheck.add(99);
       numbercheck.add(1078);

        System.out.println(numbercheck.contains(1));
        System.out.println(numbercheck.contains(999));
    }
}
