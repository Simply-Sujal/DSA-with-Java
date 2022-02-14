import java.util.ArrayList;

// Qst. 6 Print the ascii value of character 

public class Problem6 {
    public static void main(String[] args) {
        // char ch = 's';
        // System.out.println(ch + 0);
        // subseqAscii("", "abc");
        System.out.println(SubSeqRetAscii("", "abc"));
    }

    static void subseqAscii(String p , String up){
        // base condtion
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
        
    }

    static ArrayList<String> SubSeqRetAscii(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        } 

        char ch = up.charAt(0);
        ArrayList<String> first = SubSeqRetAscii(p + ch, up.substring(1)); 
        ArrayList<String> second = SubSeqRetAscii(p, up.substring(1));
        ArrayList<String> third = SubSeqRetAscii(p + (ch + 0), up.substring(1)); 

        first.addAll(second);
        first.addAll(third);
        return first;
        
    }
}
