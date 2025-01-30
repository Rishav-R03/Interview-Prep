class Solution(object):
    # inplace
    # using TC: O(n) and SC: O(n)
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        count_zeros = 0
        n = len(nums)
        newArray = [0]*n
        i = 0
        j = 0
        while(i<n):
            if nums[i]==0:
                i+=1
            elif(nums[i]!=0):
                newArray[j] = nums[i]
                i+=1
                j+=1

        for i in range(n):
            nums[i] = newArray[i]

# in-place
# optimised using the two pointer approach
# TC: O(n) and SC: O(1)
def moveZeroes(self, nums):
    zero = 0  # records the position of "0"
    for i in range(len(nums)):
        if nums[i] != 0:
            nums[i], nums[zero] = nums[zero], nums[i]
            zero += 1