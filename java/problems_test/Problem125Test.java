package problems_test;

import problems.Problem125;

public class Problem125Test {
    public static void main(String[] args) {
        Problem125 sol = new Problem125();

        String s1 = "A man, a plan, a canal: Panama";
        boolean result = sol.isPalindrome(s1);
        System.out.println("Test 1:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result);
        System.out.println();

        String s2 = "race a car";
        result = sol.isPalindrome(s2);
        System.out.println("Test 2:");
        System.out.println("Expected: false");
        System.out.println("Output: " + result);
        System.out.println();

        String s3 = " ";
        result = sol.isPalindrome(s3);
        System.out.println("Test 3:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result);
        System.out.println();
    }
}
