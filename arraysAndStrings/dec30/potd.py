# using dp programming
class Solution:
    def countGoodStrings(self, low: int, high: int, zero: int, one: int) -> int:
        # low is the start range, and high is the upper bound
        # zeroes means toltal 0 we have, and ones means we have 1 
        dp = [1] + [0]*(high)
        mod = 10**9 + 7
        for end in range(1,high+1):
            if end>=zero:
                dp[end] += dp[end-zero]
            if end>=one:
                dp[end] += dp[end-one]
            dp[end]%=mod

        return sum(dp[low:high+1])%mod


        faopjfjfjf