

public class Problem3{
    public static void main(String[] args) {
        int[] numbers = {0,1};
        change(numbers);
        Printarray(numbers); // 1 0
    }

    private static void Printarray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    static void change(int[] numbers){
        numbers[0] = 1; //1 1
        numbers[1] = 0; // 1 0
    }
}