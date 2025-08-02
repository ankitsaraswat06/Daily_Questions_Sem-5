# Last updated: 02/08/2025, 18:58:07
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        nums.sort()
        return nums[n//2]
        

        