// Last updated: 02/08/2025, 18:58:59
class Solution {
    public String getPermutation(int n, int k) {
        int f = 1; 
        List<Integer> ll = new ArrayList<>();
        for(int i=1; i<n; i++) {
            f*=i;
            ll.add(i);
        }
        ll.add(n);
        k = k-1;
        StringBuilder sb = new StringBuilder();
        while(true) {
            sb.append(ll.get(k/f));
            ll.remove(k/f);
            if(ll.size()==0) break;
            k = k%f;
            f = f/ll.size();
        }
        return sb.toString();

    }
}