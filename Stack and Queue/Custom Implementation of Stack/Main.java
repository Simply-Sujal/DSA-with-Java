public class Main {
    public static void main(String[] args) throws Stackexception{
        // CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack();

        stack.push(32);
        stack.push(100);
        stack.push(45);
        stack.push(5);
        stack.push(76);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
