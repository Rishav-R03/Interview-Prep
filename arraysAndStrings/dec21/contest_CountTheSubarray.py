class Solution:
    def countSubarrays(self, nums: list[int]) -> int:
        # fixed frame size of 3
        count = 0
        for i in range(len(nums) - 2):
            # Get the three elements in the current window
            first, middle, third = nums[i], nums[i+1], nums[i+2]
            # Check if the condition is satisfied
            if first + third == middle / 2:
                count += 1
        return count