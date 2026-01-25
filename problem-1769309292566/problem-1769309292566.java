// Last updated: 25/01/2026, 08:18:12
1class Solution {
2    public void rotate(List<Integer> pos, int k) {
3        if(pos.size()==0) return;
4        k=k%pos.size();
5        int i=0;
6        int j=k-1;
7        while(i<j) {
8            Collections.swap(pos, i, j);
9            i++;
10            j--;
11        }
12        i=k;
13        j=pos.size()-1;
14        while(i<j) {
15            Collections.swap(pos, i, j);
16            i++;
17            j--;
18        }
19        i=0;
20        j=pos.size()-1;
21        while(i<j) {
22            Collections.swap(pos, i, j);
23            i++;
24            j--;
25        }
26    }
27    public int[] rotateElements(int[] nums, int k) {
28        List<Integer> pos = new ArrayList<>();
29        for(int el: nums) if(el>=0) pos.add(el);
30
31        rotate(pos, k);
32        int[] ans = new int[nums.length];
33        int idx = 0;
34
35        for(int i=0; i<nums.length; i++) {
36            if(nums[i]<0) ans[i] = nums[i];
37            else ans[i] = pos.get(idx++);
38        }
39        return ans;
40        
41    }
42}