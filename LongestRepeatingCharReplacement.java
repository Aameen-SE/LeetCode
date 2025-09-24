//Longest Repeating Character Replacement

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));     // 4
        System.out.println(characterReplacement("AABABBA", 1));  // 4
    }

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // if we need more than k replacements → shrink window
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
