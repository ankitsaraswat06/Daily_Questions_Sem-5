# Last updated: 02/08/2025, 18:59:10
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        lst = list(s.split())
        n  = len(lst)-1
        return len(lst[n])

        