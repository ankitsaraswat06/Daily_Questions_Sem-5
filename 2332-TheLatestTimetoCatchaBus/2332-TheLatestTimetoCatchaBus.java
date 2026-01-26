// Last updated: 26/01/2026, 22:01:34
1class Solution {
2    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
3        Arrays.sort(buses);
4        Arrays.sort(passengers);
5        HashSet<Integer> set=new HashSet<>();
6        for(int arr_time:passengers)  set.add(arr_time); 
7
8        int pi=0, pass_cnt=0, lastboard=0;
9        for(int dept:buses){
10            int cnt=0;
11            while(pi<passengers.length && passengers[pi]<=dept && cnt<capacity){
12                lastboard=passengers[pi]; //last passenger arrival_time
13                cnt++;
14                pi++;
15            }
16            pass_cnt=cnt; //tracks capacity of curr bus
17        }
18
19        int latest_time=0;
20        if(pass_cnt<capacity)   latest_time=buses[buses.length-1]; 
21        else latest_time=lastboard-1; 
22
23        while(set.contains(latest_time))  latest_time-=1;
24        return latest_time;
25        
26    }
27}