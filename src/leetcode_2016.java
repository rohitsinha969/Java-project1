/**
 * leetcode 2016
 */
public class leetcode_2016 {

    public static int maximumDifference(int[] nums) {
        //Maximum Difference Between Increasing Elements
        int maxDiff = -1;
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= min) {
                min = nums[i];
            } else {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int nums[] = {9,4,3,2,11};
        // for(int i=0; i<nums.length; i++){
        //     if()
        // }
        System.out.println(maximumDifference(nums));
    }
}