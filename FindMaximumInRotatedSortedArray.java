public class FindMaximumInRotatedSortedArray {

    public static int findMaximum(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;


            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }


        int minIndex = left;
        int maxIndex = (minIndex - 1 + nums.length) % nums.length;
        return nums[maxIndex];
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int[] nums2 = {3,4,5,1,2};
        int[] nums3 = {1,2,3,4,5};

        System.out.println("Maximum in nums1: " + findMaximum(nums1)); // 7
        System.out.println("Maximum in nums2: " + findMaximum(nums2)); // 5
        System.out.println("Maximum in nums3: " + findMaximum(nums3)); // 5
    }
}
