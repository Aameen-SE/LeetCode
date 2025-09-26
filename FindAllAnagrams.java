import java.util.*;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] countP = new int[26];
        int[] countS = new int[26];


        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }


        for (int i = 0; i < p.length(); i++) {
            countS[s.charAt(i) - 'a']++;
        }


        if (matches(countP, countS)) result.add(0);


        for (int i = p.length(); i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
            countS[s.charAt(i - p.length()) - 'a']--;

            if (matches(countP, countS)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));
    }
}
