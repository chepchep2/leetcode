package problems_test;

import problems.Problem232;

public class Problem232Test {
    public static void main(String[] args) {
        Problem232 myQueue = new Problem232();

        myQueue.push(1);
        myQueue.push(2);

        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}
