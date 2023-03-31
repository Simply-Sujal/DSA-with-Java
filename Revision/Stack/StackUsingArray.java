// here we are going to implement the stack using array.
package Stack;

public class StackUsingArray {

    private int data[];
    private int top; // is the index of topmost element of stack

    // constructor
    public StackUsingArray() {
        data = new int[5];
        top = -1;
    }

    // constructor
    public StackUsingArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    // checking whether the element is present in stack or not
    public boolean isEmpty() {
        // if stack is empty return true;
        return (top == -1);
    }

    // checking the size of stack
    public int size() {
        return top + 1;
    }

    // checking for the topmost element in the stack
    public int top() {
        if (size() == 0) {
            return 0; // this means there is no element in a stack
        }
        return data[top];
    }

    // pushing the element in a stack
    // TC :- O(1)
    public void push(int element) {
        if (size() == data.length) {
            // System.out.println("Stack is FULL");
            doubleCapacity();
        } else {
            top++;
            data[top] = element;
        }
    }

    // dynamically this function will double the capacity of stack when it is fully
    // filled up
    // copying data into new array will take n time so this is O(n) complexity
    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i <= top; i++) {
            data[i] = temp[i];
        }
    }

    // poping the element from the stack
    // TC :- O(1)
    public int pop() {
        if (size() == 0) {
            return 0;
        }
        int x = data[top];
        top--;
        return x;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 5);
        }

        while (stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}