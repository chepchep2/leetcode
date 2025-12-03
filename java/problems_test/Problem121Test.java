package problems_test;

import problems.Problem121;

import java.sql.Array;

public class Problem121Test {
    public static void main(String[] args) {
        Problem121 sol = new Problem121();

        // Test code 1
        int[] prices1 = {7, 1, 5, 3, 6};
        int result = sol.maxProfit(prices1);
        System.out.println("Test 1:");
        System.out.println("Expected: 5");
        System.out.println("Output: " + result);
        System.out.println();

        int[] prices2 = {7, 6, 4, 3, 1};
        result = sol.maxProfit(prices2);
        System.out.println("Test 2:");
        System.out.println("Expected: 0");
        System.out.println("Output: " + result);
        System.out.println();

        int[] prices3 = {3, 2, 6, 1, 5};
        result = sol.maxProfit(prices3);
        System.out.println("Test 3:");
        System.out.println("Expected: 4");
        System.out.println("Output: " + result);
        System.out.println();

        int[] prices4 = {3, 2, 6, 1, 4};
        result = sol.maxProfit(prices4);
        System.out.println("Test 4:");
        System.out.println("Expected: 4");
        System.out.println("Output: " + result);
    }
}
