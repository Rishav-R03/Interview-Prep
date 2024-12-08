class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                // Move nums[i] steps to the right
                result[i] = nums[(i + nums[i]) % n];
            } else if (nums[i] < 0) {
                // Move abs(nums[i]) steps to the left
                result[i] = nums[(i + nums[i] % n + n) % n];
            } else {
                // nums[i] == 0
                result[i] = nums[i];
            }
        }
        return result;
    }
}
