package problems_test;

import problems.Problem242;

public class Problem242Test {
    public static void main(String[] args) {
        Problem242 sol = new Problem242();

        String s = "anagram";
        String t = "nagaram";
        boolean result = sol.isAnagram(s, t);
        System.out.println("Test 1:");
        System.out.println("Expected: true");
        System.out.println("Output: " + result);
        System.out.println();

        s = "rat";
        t = "car";
        result = sol.isAnagram(s, t);
        System.out.println("Test 2:");
        System.out.println("Expected: false");
        System.out.println("Output: " + result);
        System.out.println();
    }
}
