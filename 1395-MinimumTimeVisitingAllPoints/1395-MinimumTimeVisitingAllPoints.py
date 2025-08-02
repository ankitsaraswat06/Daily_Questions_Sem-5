# Last updated: 02/08/2025, 18:54:39
class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        t = 0
        for i in range(len(points)-1):
            startPoint = points[i]
            targetPoint = points[i+1]
            xI = startPoint[0]
            xF = targetPoint[0]
            yI = startPoint[1]
            yF = targetPoint[1]
            while(xI!=xF or yI!=yF):
                if(xI>xF and yI>yF):
                    xI-=1
                    yI-=1
                    t+=1
                elif(xI<xF and yI<yF):
                    xI+=1
                    yI+=1
                    t+=1
                elif(xI>xF and yI<yF):
                    xI-=1
                    yI+=1
                    t+=1
                elif(xI<xF and yI>yF):
                    xI+=1
                    yI-=1
                    t+=1
                elif(xI>xF and yI==yF):
                    xI-=1
                    t+=1
                elif(xI<xF and yI==yF):
                    xI+=1
                    t+=1
                elif(yI>yF and xI==xF):
                    yI-=1
                    t+=1
                else:
                    yI+=1
                    t+=1
        return t




        