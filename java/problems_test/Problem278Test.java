package problems_test;

import problems.Problem278;

public class Problem278Test {
    public static void main(String[] args) {
        Problem278 solution1 = new Problem278(4);
        System.out.println(solution1.firstBadVersion(5));

        Problem278 solution2 = new Problem278(1);
        System.out.println(solution2.firstBadVersion(1));
    }
}
