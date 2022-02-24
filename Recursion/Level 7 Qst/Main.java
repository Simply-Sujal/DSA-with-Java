
// Printing the subsequences 

public class Main{
    public static void subsequences(String str, int indx, String newString)
    {
        if(indx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(indx);
        
        subsequences(str, indx+1, newString+currchar);
        subsequences(str, indx+1, newString);
    }
    public static void main(String[]args)
    {
        String str="abc";
        subsequences(str, 0, "");
    }
}