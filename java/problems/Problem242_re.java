package problems;

import java.util.HashMap;

public class Problem242_re {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char s1 : s.toCharArray()) {
            mapS.put(s1, mapS.getOrDefault(s1, 0) + 1);
        }

        for (char t1 : t.toCharArray()) {
            mapT.put(t1, mapT.getOrDefault(t1, 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
