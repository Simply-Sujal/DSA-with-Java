
// Find the smallest letter greater than target 

public class Problem4 {
    public static void main(String[] args) {
        char[] letters = {'c','f','h','k'};
        char target = 'k';
        char ans = nextletters(letters,target);
        System.out.println(ans);
    }

    static char nextletters(char[] letters , char target){

        int start = 0;
        int end = letters.length - 1;

        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < letters[mid]) {
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
