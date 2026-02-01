// Last updated: 01/02/2026, 08:38:50
1class RideSharingSystem {
2    List<Integer> rL;
3    List<Integer> dL;
4
5    public RideSharingSystem() {
6        rL = new ArrayList<>();
7        dL = new ArrayList<>();
8        
9    }
10    
11    public void addRider(int riderId) {
12        rL.add(riderId);
13        
14    }
15    
16    public void addDriver(int driverId) {
17        dL.add(driverId);
18        
19    }
20    
21    public int[] matchDriverWithRider() {
22        if(rL.size()==0 || dL.size()==0) return new int[]{-1, -1};
23        int r = rL.remove(0);
24        int d = dL.remove(0);
25        return new int[]{d, r};
26        
27    }
28    
29    public void cancelRider(int riderId) {
30        for(int i=0; i<rL.size(); i++) {
31            if(rL.get(i)==riderId) rL.remove(i);
32        }
33        
34        
35    }
36}
37
38/**
39 * Your RideSharingSystem object will be instantiated and called as such:
40 * RideSharingSystem obj = new RideSharingSystem();
41 * obj.addRider(riderId);
42 * obj.addDriver(driverId);
43 * int[] param_3 = obj.matchDriverWithRider();
44 * obj.cancelRider(riderId);
45 */