public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxsub = nums[0];
        int maxsum = 0;
        for (int num : nums) {
            if (maxsum < 0) {
                maxsum = 0;
            }
            maxsum += num;
            maxsub = Math.max(maxsub, maxsum);
        }
        return maxsub;
    }

    public static void main(String[] args) {
        Maximum_Subarray sol = new Maximum_Subarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sol.maxSubArray(nums));
    }
}
