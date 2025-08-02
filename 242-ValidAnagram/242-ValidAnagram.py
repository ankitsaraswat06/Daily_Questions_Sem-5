# Last updated: 02/08/2025, 18:57:37
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(sorted(s)==sorted(t)):
            return True
        else:
            return False

    
        