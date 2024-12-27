class Solution:
    def maxScoreSightseeingPair(self, values: List[int]) -> int:
        n = len(values)
        max_left = [0]*n
        max_left[0] = values[0]
        maxScore = 0
        for i in range(1,n):
            currRight = values[i]-i
            maxScore = max(maxScore,max_left[i-1]+currRight)
            curr_left = values[i]+i
            max_left[i] = max(max_left[i-1],curr_left)
        
        return maxScore