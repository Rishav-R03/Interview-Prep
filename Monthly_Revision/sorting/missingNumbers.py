def findMissing(nums:list[int])->int:
    n = len(nums)
    totalSum = (n*(n+1))//2
    elemSum = sum(nums)
    return totalSum - elemSum

nums = [2,4,0,1]

print(findMissing(nums))