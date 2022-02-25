
// Qst. 2 in this qst. you need to remove the particular string from the original string 
// we have string - "bcadappleghgh";
// in above string we need to remove the apple string and after removal the string which remains at last will our ans. 

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(skipApple("bacdapplebcr"));
    }
    
     static String skipApple(String up){
         // base condtion
         if(up.isEmpty()){
            return " ";
         }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
     }
}
