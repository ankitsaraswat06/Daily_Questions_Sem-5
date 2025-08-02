# Last updated: 02/08/2025, 18:59:08
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s = ""
        for el in digits:
            s+=str(el)
        num = str(int(s)+1)
        lst = []
        for k in num:
            lst.append(int(k))
        return lst

    
       