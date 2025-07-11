
//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int result[] = new int[0];
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i =0;i<nums.length;i++){
            int c= target-nums[i];
            
            if (map.containsKey(c)){
                result = new int[]{map.get(c),i}; 
            }
            map.put(nums[i],i);
        }

        System.out.println(Arrays.toString(result));

       
    }
    

}
