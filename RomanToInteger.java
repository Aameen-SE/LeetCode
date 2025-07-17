import java.util.HashMap;
import java.util.Map;

// Roman to Integer
public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInteger("III"));
        System.out.println(romanToInteger("V"));

    }

    public static int romanToInteger(String st){
       String s = st.toUpperCase();
        Map<Character,Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum =0;

        for (int i=0;i<s.length();i++){
            int value = romanMap.get(s.charAt(i));

            if(i+1<s.length()&& value<romanMap.get(s.charAt(i+1))){
                sum=sum-value;
            }
            else {
                 sum=sum+value;
            }
        }
        return sum;
    }
}
