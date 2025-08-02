// Last updated: 02/08/2025, 18:55:27
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String [] a1 = s1.split(" ");
        String [] a2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<a1.length; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 0)+1);
        }    
        for(int i=0; i<a2.length; i++) {
            map.put(a2[i], map.getOrDefault(a2[i],0)+1);
        }   
        int n =0; 
        for(String s: map.keySet()) {
            if(map.get(s)==1) n++;
        }
        String[] ans = new String[n];
        int idx = 0;
        for(String s: map.keySet()) {
            if(map.get(s)==1) ans[idx++] = s;
        }
        return ans;
    }
}