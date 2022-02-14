

// Search a String

public class Part2{
    public static void main(String[] args) {
        String name = "SUJAL";
        char target = 'S';

        boolean ans = search1(name, target);
        System.out.print(ans);
    }


    static boolean search1(String str , char target){

       if (str.length() == 0) {
           return false;
       }

       for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
       }

       return false;

    }
}