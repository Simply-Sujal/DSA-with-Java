import java.util.Stack;

public class NextGrElement2 {
    public static void Greater(int nums[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                st.push(nums[i]);
                nums[i] = nums[i + 1];
            } else {
                nums[i] = st.pop();
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1 };
        Greater(nums);
    }
}
