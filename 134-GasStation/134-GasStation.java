// Last updated: 02/08/2025, 18:58:24
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tReq = 0, tHave =0;
        for(int i=0; i<cost.length; i++) {
            tReq+=cost[i];
        }
        for(int i=0; i<gas.length; i++) {
            tHave+=gas[i];
        }
        if(tHave-tReq<0) return -1;
        
        int idx =0, curr=0;
        for(int i=0; i<gas.length; i++){
            curr+=gas[i]-cost[i];
            if(curr < 0) {
                curr = 0;
                idx = i+1;
            }
        }
        return idx;
    }
}