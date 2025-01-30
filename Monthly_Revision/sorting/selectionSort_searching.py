class Solution:
    def sorting(self,nums:list[int]):
        n = len(nums)
        for i in range(n-1):
            min_idx = i
            for j in range(i+1,n):
                if nums[j]<nums[min_idx]:
                    min_idx = j
                nums[i],nums[min_idx] = nums[min_idx],nums[i]

    def binarySearch(self,nums:list[int],target:int)->int:
        self.sorting(nums)
        n = len(nums)
        left = 0
        end = n-1

        while(left<=end):
            mid = left + (end-left)//2
            if nums[mid]==target:
                return mid
            elif nums[mid]>target:
                end = mid-1
            else:
                left = mid+1
        return -1

if __name__ == "__main__":
    nums = [7,3,4,2,5]
    target = 3
    obj = Solution()
    print(obj.binarySearch(nums,target))