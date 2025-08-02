# Last updated: 02/08/2025, 18:57:10
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        lst = []
        for i in nums1:
            if (i in nums2) and (i not in lst):
                lst.append(i)
        return lst
        
        