import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String urname = input.next();

    String Myself = myString(urname);
    System.out.println(Myself); 
    
    input.close();

    }

    static String myString(String identity){
        String answer = "Hey wasuup , my name is " + identity;
        return answer;
    }
}
