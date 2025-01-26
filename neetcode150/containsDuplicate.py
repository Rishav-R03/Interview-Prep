class solution:
    def __init__(self,nums):
        self.nums = nums

    def containsDuplicate(self):
        return len(self.nums) != len(set(self.nums))        