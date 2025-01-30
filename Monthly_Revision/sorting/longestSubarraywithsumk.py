# def longestSubArrayWithSumK(nums:list[int],k:int)->int:
#     n = len(nums)
#     newMap = {}
def subArray(nums,k):
    n = len(nums)
    prefix = {0:-1}
    maxLen = 0
    currSum = 0
    for i in range(n):
        currSum += nums[i]
        val = currSum - k
        if val in prefix:
            maxLen = max(maxLen,i-prefix[val])
        if currSum not in prefix:
            prefix[currSum] = i 

    return maxLen