// Last updated: 21/12/2025, 08:42:31
1class Solution {
2    public void rec(int[] arr, List<Integer> ll , List<List<Integer>> ans, boolean[] used) {
3        if(ll.size()==arr.length) {
4            ans.add(new ArrayList<>(ll));
5            return;
6        }
7        for(int i=0; i<arr.length; i++) {
8            if(!used[i]) {
9                ll.add(arr[i]);
10                used[i] = true;
11                rec(arr, ll, ans, used);
12                used[i]  = false;
13                ll.remove(ll.size()-1); 
14            }
15        }
16    }
17    public boolean isValid(List<Integer> ll) {
18        int hour = ll.get(1) + ll.get(0)*10;
19        int minute = ll.get(3) + ll.get(2)*10;
20        if(hour>=24 || hour<0) return false;
21        if(minute>59 || minute<0) return false;
22        return true;
23    }
24    public String largestTimeFromDigits(int[] arr) {
25        List<List<Integer>> ans = new ArrayList<>();
26        List<Integer> ll = new ArrayList<>();
27        boolean used[] = new boolean[arr.length];
28        rec(arr, ll, ans, used);
29        List<String> times = new ArrayList<>();
30        for(List<Integer> el: ans) {
31            if(isValid(el)) {
32                StringBuilder sb = new StringBuilder();
33                for(int tx: el) sb.append(tx);
34                times.add(sb.toString());
35
36            }
37        }
38        if(times.size()==0) return "";
39        Collections.sort(times, (a,b)-> a.compareTo(b));
40        String out = times.get(times.size()-1);
41        StringBuilder print = new StringBuilder();
42        print.append(out.charAt(0));
43        print.append(out.charAt(1));
44        print.append(":");
45        print.append(out.charAt(2));
46        print.append(out.charAt(3));
47        return print.toString();
48        
49    }
50}