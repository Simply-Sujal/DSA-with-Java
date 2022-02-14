
// In this question we have to deal with the string means , we have to remove the particular character from the string by recursivly
public class Problem6 {
    public static void main(String[] args) {
        String str = "yhhxwxix";
        System.out.println(removeX(str));
    }

    public static String removeX(String str){
        // base case 
        if (str.length() == 0) {   // or we can write if str.isEmpty then return str
            return str;
        }

        String ans = "";
        if (str.charAt(0) != 'x') {
            ans = ans + str.charAt(0);
        }

        String smallAns = removeX(str.substring(1,str.length()));
        return ans + smallAns;
    }
}
