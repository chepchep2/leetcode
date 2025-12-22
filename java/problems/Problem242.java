package problems;

import java.util.HashMap;

public class Problem242 {
    public boolean isAnagram(String s, String t) {
//        char[] charsS = s.toCharArray();
//        char[] charsT = t.toCharArray();
//
//        for (int i = 0; i < charsS.length - 1; i++) {
//            for (int j = 0; j < charsS.length - 1 - i; j++) {
//                if (charsS[j] > charsS[j + 1]) {
//                    char temp = charsS[j];
//                    charsS[j] = charsS[j + 1];
//                    charsS[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < charsT.length - 1; i++) {
//            for (int j = 0; j < charsT.length - 1 - i; j++) {
//                if (charsT[j] > charsT[j + 1]) {
//                    char temp = charsT[j];
//                    charsT[j] = charsT[j + 1];
//                    charsT[j + 1] = temp;
//                }
//            }
//        }
//
//        String sortedS = new String(charsS);
//        String sortedT = new String(charsT);
//
//        return sortedS.equals(sortedT);
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
