public class countingoccurence {
    public static void main(String[] args) {
        int a = 23433453;
        int count = 0;

        while (a > 0) {
            int rem = a % 10;
            if (rem == 3) {
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }
}
