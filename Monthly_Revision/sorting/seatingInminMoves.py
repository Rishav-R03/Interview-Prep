class Solution:
    def minMoves(seats:list[int],students:list[int])->int:
        seats.sort()
        students.sort()
        res = 0
        for i in range(0,len(seats)):
            res += abs(seats[i]-students[i])
        return res


print(Solution.minMoves([4,5,1,9], [3,1,6,2]))