
class Solution:
    def maxSubsequence(self, nums: list[int], k: int) -> list[int]:
        return [n for i,n in sorted(sorted(enumerate(nums),key = lambda e:-e[1])[:k])]
    
# method 2 

def findingKsizeLargestSum(nums:list[int],k:int)->list[int]:
    n = len(nums)
    if n<=k:
        return nums
    
    windowSum = sum(nums[:k])
    maxSum = windowSum

    for i in range(n-k):
        windowSum = windowSum - nums[i] + nums[i+k]
        maxSum = max(maxSum,windowSum)

    return [nums[i] for i in range(k) if windowSum == maxSum]