// Last updated: 07/12/2025, 15:58:11
1class Solution {
2    public int binary(int n) {
3        String bin = Integer.toBinaryString(n);
4        String rev = new StringBuilder(bin).reverse().toString();
5        return Integer.parseInt(rev, 2);
6    }
7    public int[] sortByReflection(int[] nums) {
8        Integer ans[] = new Integer[nums.length];
9        for(int i=0; i<ans.length; i++) ans[i] = nums[i];
10        Arrays.sort(ans, (a,b)-> {
11            int binA = binary(a);
12            int binB = binary(b);
13            if(binA==binB) return a-b;
14            else return binA-binB;
15        });
16
17        int[] f = new int[nums.length];
18        for(int i=0; i<nums.length; i++) f[i] = ans[i];
19        return f;
20    }
21}