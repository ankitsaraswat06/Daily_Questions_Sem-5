// Last updated: 10/12/2025, 21:59:52
1class Solution {
2    public int trap(int[] arr) {
3        int n = arr.length;
4        int total=0, lMax=0, rMax=0, l=0, r=n-1;
5        while(l<r) {
6            if(arr[l]<=arr[r]) {
7                if(lMax>arr[l]) {
8                    total+=lMax-arr[l];
9                } else {
10                    lMax = arr[l];
11                }
12                l=l+1;
13            } else {
14                if(rMax>arr[r]) {
15                    total+=rMax-arr[r];
16                } else {
17                    rMax = arr[r];
18                }
19                r = r-1;
20            }
21        }
22        return total;
23        
24    }
25}