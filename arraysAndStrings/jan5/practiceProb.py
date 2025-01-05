'''
What the Code Does
Input: A list of integers nums.
Task: Compute distinct averages by summing the smallest and largest remaining numbers, dividing by 2, and recording the result.
Output: Count of distinct averages.
'''
class Solution:
    def distinctAverages(self, nums: List[int]) -> int:
        if not nums:  # Handle edge case where nums is empty
            return 0
        
        avg_set = set()
        nums.sort()
        n = len(nums)
        
        for i in range(n // 2):  # Only loop through half
            avg_set.add((nums[i] + nums[n - i - 1]) / 2)
        
        return len(avg_set)
