// Last updated: 14/01/2026, 23:22:07
1class Solution {
2    int[][] dp; // Memoization table
3    
4    public int maxOperations(int[] nums) {
5        int n = nums.length;
6        dp = new int[n][n];
7        for (int[] row : dp) Arrays.fill(row, -1);
8        
9        int ans = 0;
10        
11        // Try all three possible first operations:
12        // Case 1: Remove first two elements
13        ans = Math.max(ans, 1 + solve(2, n - 1, nums, nums[0] + nums[1]));
14        
15        // Case 2: Remove last two elements  
16        ans = Math.max(ans, 1 + solve(0, n - 3, nums, nums[n - 1] + nums[n - 2]));
17        
18        // Case 3: Remove first and last elements
19        ans = Math.max(ans, 1 + solve(1, n - 2, nums, nums[0] + nums[n - 1]));
20        
21        return ans;
22    }
23    
24    private int solve(int i, int j, int[] nums, int sum) {
25        // Base case: not enough elements
26        if (i >= j) return 0;
27        
28        // Check memoization
29        if (dp[i][j] != -1) return dp[i][j];
30        
31        int ans = 0;
32        
33        // Option 1: Remove first two elements of current subarray
34        if (nums[i] + nums[i + 1] == sum) {
35            ans = Math.max(ans, 1 + solve(i + 2, j, nums, sum));
36        }
37        
38        // Option 2: Remove first and last elements of current subarray
39        if (nums[i] + nums[j] == sum) {
40            ans = Math.max(ans, 1 + solve(i + 1, j - 1, nums, sum));
41        }
42        
43        // Option 3: Remove last two elements of current subarray
44        if (nums[j] + nums[j - 1] == sum) {
45            ans = Math.max(ans, 1 + solve(i, j - 2, nums, sum));
46        }
47        
48        // Memoize and return
49        return dp[i][j] = ans;
50    }
51}