public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // found target
            } else if (nums[mid] < target) {
                left = mid + 1; // search right side
            } else {
                right = mid - 1; // search left side
            }
        }

        // if not found, left will be the insert position
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        System.out.println("Insert position: " + sip.searchInsert(nums, target)); // Output: 1
    }
}
