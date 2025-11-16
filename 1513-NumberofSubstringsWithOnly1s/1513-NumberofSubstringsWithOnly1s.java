// Last updated: 16/11/2025, 12:05:19
class Solution {
    int MOD = 1000000007;
    public int numSub(String s) {
        long c =0;
        long ans = 0;
        if(s.charAt(0)=='1') c++;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i)=='1')c++;
            else {
                ans = (ans + ((c*(c+1))/2)%MOD)%MOD;
                c=0;
            }
        }
        ans = (ans + ((c*(c+1))/2)%MOD)%MOD;
        return (int)ans;
        
    }
}