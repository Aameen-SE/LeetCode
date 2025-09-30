public class FirstBadVersion {


    static int firstBad = 4;


    public static boolean isBadVersion(int version) {
        return version >= firstBad;
    }


    public static int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = firstBadVersion(n);

        System.out.println("First bad version is: " + result);
    }
}
