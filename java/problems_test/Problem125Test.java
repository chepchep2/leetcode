package problems_test;

import problems.Problem125;
import problems.Problem125_re;

public class Problem125Test {
    public static void main(String[] args) {
        Problem125 sol = new Problem125();
        Problem125_re solRe = new Problem125_re();

        String s1 = "A man, a plan, a canal: Panama";
        boolean result = sol.isPalindrome(s1);
        System.out.println("Test 1:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result);
        System.out.println();

        boolean result2 = solRe.isPalindrome(s1);
        System.out.println("Test 1_Re:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result2);
        System.out.println();

        String s2 = "race a car";
        result = sol.isPalindrome(s2);
        System.out.println("Test 2:");
        System.out.println("Expected: false");
        System.out.println("Output: " + result);
        System.out.println();

        result2 = solRe.isPalindrome(s2);
        System.out.println("Test 2_Re:");
        System.out.println("Expected: false");
        System.out.println("Output: " + result2);
        System.out.println();

        String s3 = " ";
        result = sol.isPalindrome(s3);
        System.out.println("Test 3:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result);
        System.out.println();

        result2 = solRe.isPalindrome(s3);
        System.out.println("Test 3_Re:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result);
        System.out.println();
    }
}
