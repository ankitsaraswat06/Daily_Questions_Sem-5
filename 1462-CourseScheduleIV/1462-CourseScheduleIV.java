// Last updated: 24/02/2026, 15:58:32
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] arr, int[][] queries) {
3        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
4        boolean isreachable[][]=new boolean[numCourses][numCourses];
5        for(int i=0;i<numCourses;i++){
6            map.put(i,new ArrayList<>());
7        }
8
9        for(int i=0;i<arr.length;i++){
10            map.get(arr[i][0]).add(arr[i][1]);
11        }
12
13        int indeg[]=new int[numCourses];
14        for(int keys:map.keySet()){
15            for(int nbrs:map.get(keys)){
16                indeg[nbrs]++;
17            }
18        }
19
20        Queue<Integer> que=new LinkedList<>();
21        ArrayList<Integer> order=new ArrayList<>();
22
23        for(int i=0;i<indeg.length;i++){
24            if(indeg[i]==0){
25                que.add(i);
26            }
27        }
28        while(!que.isEmpty()){
29            int u=que.poll();
30            for(int v:map.get(u)){
31                isreachable[u][v]=true;
32                for(int i=0;i<numCourses;i++){
33                    if(isreachable[i][u]){
34                        isreachable[i][v]=true;
35                    }
36                }
37
38                indeg[v]--;
39                if(indeg[v]==0){
40                    que.add(v);
41                }
42            }
43        }
44        
45        List<Boolean> ans = new ArrayList<>();
46        for (int[] query : queries) {
47            ans.add(isreachable[query[0]][query[1]]);
48        }
49        return ans;
50        
51    }
52}