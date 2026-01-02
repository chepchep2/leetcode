package problems_test;

import problems.Problem242;
import problems.Problem242_re;

public class Problem242Test {
    public static void main(String[] args) {
        Problem242 sol = new Problem242();
        Problem242_re sol2 = new Problem242_re();

        String s = "anagram";
        String t = "nagaram";
        boolean result = sol.isAnagram(s, t);
        System.out.println("Test 1:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result);
        System.out.println();

        boolean result2 = sol2.isAnagram(s, t);
        System.out.println("Test 1_re:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result2);
        System.out.println();

        s = "rat";
        t = "car";
        result = sol.isAnagram(s, t);
        System.out.println("Test 2:");
        System.out.println("Expected: false");
        System.out.println("Output: " + result);
        System.out.println();

        result2 = sol2.isAnagram(s, t);
        System.out.println("Test 2_re:");
        System.out.println("Expected: false");
        System.out.println("Output: " + result2);
        System.out.println();
    }
}
