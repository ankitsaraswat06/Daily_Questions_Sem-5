# Last updated: 02/08/2025, 19:00:09
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        arr = []
        f=0
        for i in range(0, len(nums)):
            for j in range(0, len(nums)):
                if (nums[i]+nums[j]==target) and i != j:
                    arr.append(i)
                    arr.append(j)
                    f=1
            if f==1:
                break     
        return arr
        