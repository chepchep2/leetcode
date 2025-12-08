package problems;

public class Problem125 {
    public boolean isPalindrome(String s) {
        // s가 빈 문자열일 때는 return true
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
