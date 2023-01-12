public class nextGreaterElement {
    public static void main(String[] args) {
        // find the next greater element in nums2 corresponding to ith value of nums1
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 1, 4, 3, 2 };

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    ans[i] = nums2[j + 1];
                } else {
                    ans[i] = -1;
                    j++;
                }
            }
        }
        System.out.println("hello");
        System.out.println(ans);
    }
}
