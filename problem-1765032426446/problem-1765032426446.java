// Last updated: 06/12/2025, 20:17:06
1class Solution {
2    public List<Integer> binary(int num) {
3        List<Integer> ll= new ArrayList<>();
4        while(num>0) {
5            ll.add(num%2);
6            num = num/2;
7            
8        }
9        return ll;
10    }
11    public boolean isPal(List<Integer> ll) {
12        int i=0;
13        int j=ll.size()-1;
14        while(i<j) {
15            if(ll.get(i)!=ll.get(j)) return false;
16            i++;
17            j--;
18        }
19        return true;
20    }
21    public int[] minOperations(int[] nums) {
22        int ans[] = new int[nums.length];
23        for(int i=0; i<nums.length; i++) {
24            int inc = nums[i];
25            List<Integer> ll = binary(inc);
26            while(!isPal(ll)) {
27                inc++;
28                ll = binary(inc);
29            }
30            int dec = nums[i];
31            ll = binary(dec);
32            while(!isPal(ll)) {
33                dec--;
34                ll = binary(dec);
35            }
36
37            ans[i] =  Math.min(nums[i]-dec, inc-nums[i]);
38        }
39        return ans;
40    }
41}