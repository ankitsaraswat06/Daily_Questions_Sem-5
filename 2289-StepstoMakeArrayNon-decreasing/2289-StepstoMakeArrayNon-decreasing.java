// Last updated: 24/01/2026, 21:17:10
1class Solution {
2    public int totalSteps(int[] nums) {
3        int ans=0;
4        Stack<int[]>st = new Stack<>();
5        for(int i=nums.length-1;i>=0;i--){
6            int count=0;
7            while(!st.isEmpty() && st.peek()[0]<nums[i]){
8                count= Math.max(count+1, st.peek()[1]);
9                st.pop();
10            }
11            ans = Math.max(ans,count);
12            st.push(new int[]{nums[i], count});
13        }
14
15        return ans;
16    }
17}