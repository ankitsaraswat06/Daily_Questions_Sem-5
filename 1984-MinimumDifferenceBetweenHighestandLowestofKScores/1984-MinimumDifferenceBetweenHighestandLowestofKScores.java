// Last updated: 25/01/2026, 18:28:56
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        if(k==1) return 0;
4        Arrays.sort(nums);
5        int min = Integer.MAX_VALUE;
6        int i=0;
7        int currMax = 0;
8        int currMin = Integer.MAX_VALUE;
9        int j=0;
10        // System.out.println(Arrays.toString(nums));
11        for(; j<nums.length; j++) {
12            if(j-i==k)  {
13                min = Math.min(currMax-currMin, min);
14                i++;
15                currMin = nums[i];
16            }
17
18
19
20            currMax = Math.max(nums[j], currMax);
21            currMin = Math.min(nums[j], currMin);
22
23            // System.out.println(currMax+" " +currMin);
24        }
25        // System.out.println(currMax+" "+currMin);
26        if(j-i==k) min = Math.min(currMax-currMin, min);
27        return min;
28        
29    }
30}