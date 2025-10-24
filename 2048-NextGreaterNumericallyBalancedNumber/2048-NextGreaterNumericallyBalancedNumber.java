// Last updated: 24/10/2025, 21:33:26
class Solution {
    public boolean isBal(int n) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(n>0) {
            int rem= n%10;
            map.put(rem, map.getOrDefault(rem,0)+1);
            n/=10;
        }
        for(int el: map.keySet()) {
            if(map.get(el)!=el) return false;
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        int ans = n+1;
        while(true) {
            if(isBal(ans)) return ans;
            ans++;
        }
    }
}