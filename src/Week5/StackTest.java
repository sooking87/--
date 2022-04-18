package Week5;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.toString());
        int size = stack.size();
        // Last in First Out
        for (int i = 0; i < size; i++) {
            System.out.println("Idx - " + (i + 1) + ": " + stack.pop() + " pop");
        }
    }
}
