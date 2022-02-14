// import java.lang.reflect.Array;
import java.util.ArrayList;
// import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(SubSeqRet(" ", "abc"));
    }

    static ArrayList<String> SubSeqRet(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        } 

        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqRet(p + ch, up.substring(1)); 
        ArrayList<String> right = SubSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
        
    }
}
