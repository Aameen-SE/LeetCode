public class MovesZero {
    //Move all 0’s to the end while maintaining order of other numbers.

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        moveNonZero(nums);
        for (int n:nums){
            System.out.print(n+", ");
        }
    }

    public static void moveNonZero(int[] nums){
        int index = 0;
        for(int n: nums){
            if(n!=0){
                nums[index++]=n;
            }
        }
        while(index < nums.length){
            nums[index++]=0;
        }
    }
}
