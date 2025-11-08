// Last updated: 08/11/2025, 21:06:29
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int s[] = nums;
        int[] l = new int[n];
        int[] r= new int[n];
        l[0] = 1;
        for(int i=1; i<n; i++) {
            if(s[i]>=s[i-1]) {
                l[i] = l[i-1]+1;
            } else {
                l[i] = 1;
            }
        }
        r[n-1] =1;
        for(int i=n-2; i>=0; i--) {
            if(s[i]<=s[i+1]) {
                r[i] = r[i+1]+1;
            } else {
                r[i] = 1;
            }
            
        }
        int ans = 1;
        for(int i=0; i<n; i++) {
            int leftL = (i>0)?l[i-1]:0;
            int rightL = (i<n-1)?r[i+1]:0;
            if(i>0 && i<n-1 && s[i-1]<=s[i+1]) {
                ans = Math.max(ans, leftL+1+rightL);
            } else {
                ans = Math.max(ans, Math.max(leftL+1, rightL+1));
            }
        }
        return ans;
        
    }
}