class Solution:
    def binarySearch(self,nums:list[int],target:int)->int:
        n = len(nums)
        left = 0
        end = n-1
        mid = left + (end-left)//2

        while(left<=end):
            if nums[mid]==target:
                return mid
            elif nums[mid]>target:
                end = mid-1
            else:
                left = mid+1

    def sorting(self,nums:list[int]):
        n = len(nums)
        for i in range(n-1):
            min_idx = i
            for j in range(i+1,n):
                min_idx = j
                if nums[j]<nums[min_idx]:
                    nums[j],nums[min_idx] = nums[min_idx],nums[j]

if __name__ == "__main__":
    nums = [1,2,3,4,5]
    target = 3
    obj = Solution()
    print(obj.binarySearch(nums,target))