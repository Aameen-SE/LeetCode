
//Longest Substring Without Repeating Characters

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        System.out.println("Prefix 1: " + longestCommonPrefix(strs1));
        System.out.println("Prefix 2: " + longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; // assume first string is prefix

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // shrink prefix until match
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
