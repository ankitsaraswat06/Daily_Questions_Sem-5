// Last updated: 18/12/2025, 20:52:25
1class Solution {
2    public int reverse(int num) {
3        int rev = 0;
4       int n = num;
5       int c =-1;
6       while(n>0) {
7        c++;
8        n/=10;
9       }
10       int mul = (int) Math.pow(10, c);
11       while(num>0) {
12        rev = rev + (num%10 * mul);
13        mul/=10;
14        num/=10;
15       }
16       return rev;
17    }
18    public int minMirrorPairDistance(int[] nums) {
19        int n = nums.length;
20        int ans = Integer.MAX_VALUE;
21        Map<Integer, Integer> map = new HashMap<>();
22        for(int i=0; i<n; i++) {
23            if(map.containsKey(nums[i])) {
24                ans = Math.min(ans, i-map.get(nums[i]));
25            }
26            map.put(reverse(nums[i]), i);
27        }
28        return ans==Integer.MAX_VALUE?-1:ans;
29
30        
31    }
32}