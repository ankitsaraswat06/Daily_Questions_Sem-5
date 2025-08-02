# Last updated: 02/08/2025, 18:55:54
class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        lst = []
        for i in range(left, right+1):
            f = 0
            p = i
            while(i):
                rem = i%10
                if(rem==0):
                    f=1
                else:
                    if(p%rem!=0):
                        f=1               
                i =i//10
            if(f==0):
                lst.append(p)
        return lst
        
        