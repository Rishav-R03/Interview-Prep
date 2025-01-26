'''
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. 
You are also given an integer k.
Pick the scores of any k students from the array so that 
the difference between the highest and the lowest of the k 
scores is minimized.
Return the minimum possible difference.
'''

def maximumDifference(nums:list[int],k:int)->int:
    n = len(nums) 
    if n < k:
        return 0
    bubble_sort(nums)
    return nums[n-1] - nums[n-2]


def bubble_sort(nums):
    n = len(nums)
    for i in range(n):
        swapped = False
        for j in range(0,n-i-1):
            if nums[j]>nums[j+1]:
                nums[j],nums[j+1] = nums[j+1],nums[j]
                swapped = True
        if swapped == False:
            break

if __name__ == "__main__":
    nums = [9,4,1,7]
    k = 2
    print(maximumDifference(nums,k))

# alternative solution

def minimumDifference(self, nums: list[int], k: int) -> int:
	if len(nums) <= 1:
		return 0

	nums = sorted(nums)
	res = nums[k-1] - nums[0]

	for i in range(k, len(nums)):
		res = min(res, nums[i] - nums[i - k + 1])

	return res