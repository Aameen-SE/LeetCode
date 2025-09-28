import java.util.HashSet;
import java.util.Set;
// Happy Number
public class HappyNumber {
    public static void main(String[] args) {

        int num = 2;
        boolean result = isHappy(num);
        System.out.println("Is a Happy Number is :"+result);

    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    public static int getNext(int n) {
        int total = 0;
        while (n > 0) {
            int d = n % 10;
            total += d * d;
            n /= 10;
        }
        return total;
    }

}

