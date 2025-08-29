public class productexceptself {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                output[i] = suffix[i + 1];
            } else if (i == nums.length - 1) {
                output[i] = prefix[i - 1];
            } else {
                output[i] = prefix[i - 1] * suffix[i + 1];
            }
        }

        return output;
    }
// this one take space 0(n)

    /* it is more optimised in space take only 0(1) 
     * public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];

    // 1st pass → prefix product
    output[0] = 1;
    for (int i = 1; i < n; i++) {
        output[i] = output[i - 1] * nums[i - 1];
    }

    // 2nd pass → suffix product
    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
        output[i] = output[i] * suffix;
        suffix *= nums[i];
    }

    return output;
}

     */
    public static void main(String[] args) {
        productexceptself sol = new productexceptself();
        int[] nums = {3, 2, 4};
        int[] result = sol.productExceptSelf(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
