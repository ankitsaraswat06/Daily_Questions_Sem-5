// Last updated: 10/09/2025, 07:58:21
class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
       TreeMap<Integer, HashSet<Integer>> map = new TreeMap<>();
       for(int i=0; i<languages.length; i++) {
        HashSet<Integer> set = new HashSet<>();
        for(int lang: languages[i]) set.add(lang);
        map.put(i+1, set);
       }
       HashSet<Integer> nonCom = new HashSet<>();
       for(int i=0; i<friendships.length; i++) {
        HashSet<Integer>  u = map.get(friendships[i][0]);
        HashSet<Integer>  v = map.get(friendships[i][1]);
        int f = 0;
        for(int lang: u) {
            if(v.contains(lang)){
                f=1;
                break;
            }
        }
        if(f==0) {
            nonCom.add(friendships[i][0]);
            nonCom.add(friendships[i][1]);
        }

       }


       if(nonCom.isEmpty()) return 0;
       int min = Integer.MAX_VALUE;
       
       for(int i=1; i<=n; i++) {
        int count = 0;
        for(int p: nonCom) {
            HashSet<Integer> u = map.get(p);
            if(!u.contains(i)) count++;
        }
        min = Math.min(count, min);
       }
       return min;
    }
}