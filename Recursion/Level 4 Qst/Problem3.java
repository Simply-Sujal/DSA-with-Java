
// Qst. 3 Skip a string if its not the required string 
public class Problem3 {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bccdeappbera"));
        // System.out.println(skipAppNotApple("bccdeapplebera"));
    }

    static String skipAppNotApple(String up){
        // base codntion
        if(up.isEmpty()){
            return " ";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) { // if the string starts withh app then remove it and that string should not contain the word apple
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
