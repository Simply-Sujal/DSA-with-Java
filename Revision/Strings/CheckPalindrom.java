import java.util.Scanner;

public class CheckPalindrom {
    // time complexity : O(N)
    public static boolean PalindromeChecker(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any string : ");
        String st = sc.nextLine();

        boolean ans = PalindromeChecker(st);
        System.out.println(ans);

    }
}
