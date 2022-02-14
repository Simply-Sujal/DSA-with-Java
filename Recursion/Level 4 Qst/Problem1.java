
// Qst. 1 you have given a string and on that string you need remove a particular letter .
// ex. given a string = "baccad";
// in this string you need to remove the character 'a'. 
public class Problem1{
    public static void main(String[] args) {
        Skip(" ", "baccacdh");
    }
    static void Skip(String p , String up){ // p is the empty string where we will store the the real ans and up is unprocessed means it is the original string
        // base condtion 
        if(up.isEmpty()){ // if up is empty then we 
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'c'){
            Skip(p, up.substring(1)); 
        }
        else{
            Skip(p + ch, up.substring(1));
        }
    }
}