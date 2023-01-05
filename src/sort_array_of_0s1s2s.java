public class sort_array_of_0s1s2s {
    public static int[] sortColors() {
        int nums [] = {0,1,1,0,1,2,1,2,0,0,0,1};
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;

        // traversing over the array
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
        //System.out.println(nums);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(sortColors());
    }
}
