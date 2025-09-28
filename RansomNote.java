public class RansomNote {
    // Ransom Note
    public static void main(String[] args) {

        String ransom= "aab";
        String magazine="abbb";
       boolean result =  canConstruct(ransom,magazine);
        System.out.println(result);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }

        return true;
    }
}
