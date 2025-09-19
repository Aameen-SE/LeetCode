import java.util.HashSet;
import java.util.Set;

//Given an integer array, return true if any value appears at least twice.
public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr = {13,12,14,12,31,41};

        System.out.println("Do the array contain duplicate : "+containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] num){
        Set<Integer> seen = new HashSet<>();
        for (int n:num){
            if(seen.contains(n)){
                return true;
            }
            seen.add(n);
        }
        return false;
    }

}
