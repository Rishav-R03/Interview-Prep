def getCommon( nums1: list[int], nums2: list[int]) -> int:
        set1 = set(nums1)
        set2 = set(nums2)
        z = set1.intersection(set2)
        return min(z)

nums1 = [1,2,3,1]
nums2 = [2,3]
res = getCommon(nums1, nums2)
print(res)