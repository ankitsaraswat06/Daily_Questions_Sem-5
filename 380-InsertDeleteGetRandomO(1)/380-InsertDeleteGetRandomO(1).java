// Last updated: 20/12/2025, 11:35:30
1class RandomizedSet {
2    List<Integer> list;
3    Map<Integer, Integer> map;
4    Random rand;
5
6    public RandomizedSet() {
7        list = new ArrayList<>();
8        map = new HashMap<>();
9        rand = new Random();
10        
11    }
12    
13    public boolean insert(int val) {
14        if (map.containsKey(val)) return false;
15        map.put(val, list.size());
16        list.add(val);
17        return true;
18        
19    }
20    
21    public boolean remove(int val) {
22        if (!map.containsKey(val)) return false;
23
24        int idx = map.get(val);
25        int last = list.get(list.size() - 1);
26
27        // swap val with last
28        list.set(idx, last);
29        map.put(last, idx);
30
31        // remove last
32        list.remove(list.size() - 1);
33        map.remove(val);
34        return true;
35        
36    }
37    
38    public int getRandom() {
39       return list.get(rand.nextInt(list.size()));
40    }
41}
42
43/**
44 * Your RandomizedSet object will be instantiated and called as such:
45 * RandomizedSet obj = new RandomizedSet();
46 * boolean param_1 = obj.insert(val);
47 * boolean param_2 = obj.remove(val);
48 * int param_3 = obj.getRandom();
49 */