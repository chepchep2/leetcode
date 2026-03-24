package problems;

import java.util.Stack;

public class Problem232 {
    Stack<Integer> stackA = new Stack<>();
    Stack<Integer> stackB = new Stack<>();

    public Problem232() {

    }

    public void push(int x) {
        stackA.push(x);
    }

    public int pop() {
        int B;
        if (stackB.empty()) {
            while (!stackA.empty()) {
                int A = stackA.pop();
                stackB.push(A);
            }
        }
        B = stackB.pop();
        return B;
    }

    public int peek() {
        int B;
        if (stackB.empty()) {
            while (!stackA.empty()) {
                int A = stackA.pop();
                stackB.push(A);
            }
        }
        B = stackB.peek();
        return B;
    }

    public boolean empty() {
        return stackA.empty() && stackB.empty();
    }
}
