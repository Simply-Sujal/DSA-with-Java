
// Subsequence problem 
public class Subseq{
    public static void main(String[] args) {
        String str = "xyz";
        String ans[] = Subsequence(str);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }

    public static String[] Subsequence(String str){
        // base case 
        if(str.isEmpty()){
            String[] ans = {" "};
            return ans;
        }

        String[] smallAns = Subsequence(str.substring(1));
        String ans[] = new String[2 * smallAns.length];

        for(int i=0;i<smallAns.length;i++){
            ans[i] = smallAns[i];
        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }
}