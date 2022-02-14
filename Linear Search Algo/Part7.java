// Find numbers with even of digits

public class Part7{
    public static void main(String[] args) {

    int[] nums = {12,345,2,6,7896};
    // System.out.print(findNumbers(nums));

    //if we wanna run a digits example 
    System.out.print(digits2(765565)); //number of digits in the number is 5 
        
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits or not 
    static boolean even(int num) {
        int numberofdigits = digits(num);
        // if (numberofdigits % 2 == 0) {
        //     return true;
        // }
        // return false;

        // shortcut to write return value 
        return numberofdigits %2 == 0;
    }

    //shortcut to check no of digits
    static int digits2(int num){     
        
        if (num < 0) {      // checking for a negative numbers
            num = num * -1;
        } 
        return(int)(Math.log10(num)) + 1;
    }

    // count number of digits in number
    static int digits(int num){
  
       if (num < 0) {      // checking for a negative numbers
           num = num * -1;
       }

       if (num == 0) {
           return 1;
       }

       int count = 0;
       while (num > 0) {
           count++;
           num = num / 10; // or you can write like this num/=10
       }
       return count;
    }
}