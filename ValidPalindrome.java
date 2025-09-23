public class ValidPalindrome {
    public static void main(String[] args) {

     String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));

        String t = "race a car";
        System.out.println(isPalindrome(t));
    }

    private static boolean isPalindrome(String t) {
    int left =0; int right = t.length()-1;

    while (left<right){
        while (left<right&& !Character.isLetterOrDigit(t.charAt(left)))
            left++;
        while (left<right && !Character.isLetterOrDigit(t.charAt(right)))
            right--;

        if(Character.toLowerCase(t.charAt(left))!= Character.toLowerCase(t.charAt(right))){
            return false;
        }
        left++;
        right--;
    }

    return true;
    }
}
