class solution:
    def maxProduct(self,nums:list[int])->int:
        res = max(nums)
        curMin,curMax = 1,1

        for n in nums:
            if n == 0:
                curMin,curMax = 1,1
            temp = curMax*n
            curMax = max(n*curMin,n*curMax,n)
            curMin = min(temp,n*curMin,n)
            res = max(res,curMax)
        return res