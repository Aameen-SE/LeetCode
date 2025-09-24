public class ImplementStrStr {
    //Implement strStr() (Substring Search)
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "cc";

        int result = strStr(haystack, needle);
        System.out.println("Index: " + result);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
