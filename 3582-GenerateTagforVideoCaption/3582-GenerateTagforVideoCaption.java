// Last updated: 22/12/2025, 17:25:39
1class Solution {
2    public String generateTag(String caption) {
3        
4        StringBuilder sb = new StringBuilder();
5        String[] arr= caption.trim().split(" ");
6        sb.append("#");
7        sb.append(arr[0].toLowerCase());
8        for(int i=1; i<arr.length; i++) {
9            if(arr[i].length()==0) continue;
10           String one = String.valueOf(arr[i].charAt(0));
11           
12           sb.append(one.toUpperCase());
13           String two = arr[i].substring(1);
14           sb.append(two.toLowerCase());
15
16        }
17        StringBuilder ans = new StringBuilder();
18        int idx=0;
19        while(idx<sb.length()) {
20            ans.append(sb.charAt(idx++));
21            if(idx==100) break;
22        }
23        return ans.toString();
24    }
25}