// Last updated: 28/01/2026, 12:28:07
1class Solution {
2    public int minOperations(int[] nums) {
3        int op = 0;
4        int k = 3;
5        int i=0;
6        while(i<nums.length) {
7            if(nums[i]==1) {
8                i++;
9                continue;
10            }
11            if(i+k-1<=nums.length-1) {
12                for(int j=i; j<=i+k-1; j++) {
13                    nums[j]=nums[j]==1?0:1;
14                }
15                op++;
16            } else {
17                break;
18            }
19            i++;
20        }
21        if(i>=nums.length) return op;
22        else return nums[i]==0?-1:op;
23    }
24}