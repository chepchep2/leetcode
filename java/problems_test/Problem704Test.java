package problems_test;

import problems.Problem704;
import problems.Problem704_re;

public class Problem704Test {
    public static void main(String[] args) {
        Problem704_re sol = new Problem704_re();

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = sol.search(nums, target);
        System.out.println("Test 1:");
        System.out.println("Expected: 4");
        System.out.println("Output: " + result);
        System.out.println();

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        result = sol.search(nums, target);
        System.out.println("Test 2:");
        System.out.println("Expected: -1");
        System.out.println("Output: " + result);
        System.out.println();

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 12;
        result = sol.search(nums, target);
        System.out.println("Test 3:");
        System.out.println("Expected: 5");
        System.out.println("Output: " + result);
        System.out.println();

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = -1;
        result = sol.search(nums, target);
        System.out.println("Test 4:");
        System.out.println("Expected: 0");
        System.out.println("Output: " + result);
        System.out.println();

        nums = new int[]{5};
        target = 5;
        result = sol.search(nums, target);
        System.out.println("Test 5:");
        System.out.println("Expected: 0");
        System.out.println("Output: " + result);
        System.out.println();

        nums = new int[]{2, 5};
        target = 5;
        result = sol.search(nums, target);
        System.out.println("Test 5:");
        System.out.println("Expected: 1");
        System.out.println("Output: " + result);
        System.out.println();
    }
}
