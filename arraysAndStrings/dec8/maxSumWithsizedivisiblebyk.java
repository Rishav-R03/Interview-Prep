public class maxSumWithsizedivisiblebyk {

    public long maxSubarraySum(int[] nums, int k) {
        // Store the result
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        // Iterate over all possible subarray start points
        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            // Expand the window from the start point
            for (int end = start; end < n; end++) {
                currentSum += nums[end];

                // Check if the subarray size is divisible by k
                if ((end - start + 1) % k == 0) {
                    maxSum = Math.max(maxSum, currentSum);
                }
            }
        }

        return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
    }
    // passed 633/661 test cases
}
