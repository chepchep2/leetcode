package problems_test;

import problems.Problem121;
import problems.Problem121_re;

import java.sql.Array;

public class Problem121Test {
    public static void main(String[] args) {
        Problem121 sol = new Problem121();
        Problem121_re sol2 = new Problem121_re();

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
        System.out.println();

        int[] prices1Re = {7, 1, 5, 3, 6};
        int resultRe = sol2.maxProfit(prices1Re);
        System.out.println("Test 1Re:");
        System.out.println("Expected: 5");
        System.out.println("Output: " + resultRe);
        System.out.println();

        int[] prices2Re = {7, 6, 4, 3, 1};
        resultRe = sol2.maxProfit(prices2Re);
        System.out.println("Test 2RE:");
        System.out.println("Expected: 0");
        System.out.println("Output: " + resultRe);
        System.out.println();

        int[] prices3Re = {3, 2, 6, 1, 5};
        resultRe = sol2.maxProfit(prices3Re);
        System.out.println("Test 3Re:");
        System.out.println("Expected: 4");
        System.out.println("Output: " + resultRe);
        System.out.println();

        int[] prices4Re = {3, 2, 6, 1, 4};
        resultRe = sol2.maxProfit(prices4Re);
        System.out.println("Test 4Re:");
        System.out.println("Expected: 4");
        System.out.println("Output: " + resultRe);
    }
}
