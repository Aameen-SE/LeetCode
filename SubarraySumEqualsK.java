import java.util.HashMap;
// Sub Array Sum Equal K

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int k1 = 2;

        int[] nums2 = {1, 2, 3};
        int k2 = 3;

        System.out.println("Output 1: " + subarraySum(nums1, k1));
        System.out.println("Output 2: " + subarraySum(nums2, k2));
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;


            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }


            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
