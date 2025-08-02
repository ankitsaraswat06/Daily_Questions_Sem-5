# Last updated: 02/08/2025, 18:56:35
class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        lst = []
        for i in nums1:
            idx = nums2.index(i)
            f =0
            for j in range(idx+1,len(nums2)):
                if(nums2[j]>nums2[idx]):
                    lst.append(nums2[j])
                    f=1
                if(f==1):
                    break
            if(f==0):
                lst.append(-1)
        return lst
        
        