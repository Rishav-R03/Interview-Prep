from typing import List
class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        n = len(nums)
        preSum = [0]*n
        preSum[0] = nums[0]
        for i in range(1,n):
            preSum[i] = preSum[i-1] + nums[i]
            count = sum(1 for i in range(n-1) if preSum[i]>=preSum[-1]-preSum[i])
        return count
    