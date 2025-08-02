// Last updated: 02/08/2025, 18:53:45
class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ll.add(i+1);
        }
        int i=0;
        while(ll.size()>1) {
            i = (i+k-1)%ll.size();
            ll.remove(i);
            i = (i)%ll.size();
        }
        return ll.get(0);
    }
}