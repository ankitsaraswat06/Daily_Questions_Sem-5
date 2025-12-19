// Last updated: 19/12/2025, 10:47:44
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        // TC-O(logn) Sc-O(1)
4        int[] arr = new int[2];
5        int f = 0;
6
7        int start = 0;
8        int end = nums.length-1; 
9
10        while(start<=end)  {
11            int mid = start + (end-start)/2;
12            if(nums[mid] == target) {
13                arr[0] = mid;
14                end = mid-1;
15                f=1;
16            } else if(nums[mid] > target) {
17                end = mid-1;
18            } else {
19                start = mid+1;
20            }
21        }
22        if(f==0) {
23            arr[0] = -1;
24        }
25
26        start =0;
27        end = nums.length-1;
28        int k =0;
29        while(start<=end) {
30            int mid = start+(end-start)/2;
31            if(nums[mid] == target) {
32                arr[1] = mid;
33                start = mid+1;
34                k= 1;
35            } else if(nums[mid] > target) {
36                end = mid-1;
37            } else {
38                start = mid+1;
39            }
40        }
41
42        if(k==0) {
43            arr[1] = -1;
44        }
45
46        return arr;
47
48
49        
50    }
51}