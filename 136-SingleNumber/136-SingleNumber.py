# Last updated: 02/08/2025, 18:58:20
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for num in nums:
            if nums.count(num)==1:
                return num
        