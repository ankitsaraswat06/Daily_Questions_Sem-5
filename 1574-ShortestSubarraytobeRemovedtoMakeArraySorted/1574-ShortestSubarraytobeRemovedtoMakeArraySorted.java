// Last updated: 23/01/2026, 14:29:34
1class Solution {
2    public int findLengthOfShortestSubarray(int[] arr) {
3        int n = arr.length;
4
5        // 1. Find prefix
6        int i = 0;
7        while (i + 1 < n && arr[i] <= arr[i + 1]) i++;
8        if (i == n - 1) return 0;
9
10        // 2. Find suffix
11        int j = n - 1;
12        while (j > 0 && arr[j - 1] <= arr[j]) j--;
13
14        // 3. Base answer
15        int ans = Math.min(n - i - 1, j);
16
17        // 4. Merge prefix & suffix
18        for (int p = 0; p <= i; p++) {
19            int low = j, high = n - 1;
20            while (low <= high) {
21                int mid = low + (high - low) / 2;
22                if (arr[mid] >= arr[p]) {
23                    ans = Math.min(ans, mid - p - 1);
24                    high = mid - 1;
25                } else {
26                    low = mid + 1;
27                }
28            }
29        }
30
31        return ans;
32    }
33}