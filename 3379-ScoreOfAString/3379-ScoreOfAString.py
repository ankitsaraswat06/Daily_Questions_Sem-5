# Last updated: 02/08/2025, 18:52:05
class Solution:
    def scoreOfString(self, s: str) -> int:
        score=0
        for i in range(len(s)-1):
            score+=abs(ord(s[i])-ord(s[i+1]))
        return score