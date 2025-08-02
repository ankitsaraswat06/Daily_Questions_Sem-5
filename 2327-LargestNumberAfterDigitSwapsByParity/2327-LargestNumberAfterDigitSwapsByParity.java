// Last updated: 02/08/2025, 18:53:12
class Solution {
    public int largestInteger(int num) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int n = num;
        while(num>0) {
            int rem = num%10;
            if(rem%2==0) even.add(rem);
            else odd.add(rem);
            num/=10;
        }
        Collections.sort(odd);
        Collections.sort(even);
        List<Integer> ll = new ArrayList<>();
        while(n>0) {
            int rem = n%10;
            ll.add(0, rem);
            n/=10;
        }
        
        for(int i=0; i<ll.size(); i++) {
            if(ll.get(i)%2==0) {
                if(even.size()>0){
                    ll.set(i, even.get(even.size()-1));
                    even.remove(even.size()-1);
                }
            } else {
                if(odd.size()>0) {
                    ll.set(i, odd.get(odd.size()-1));
                    odd.remove(odd.size()-1);
                }
            }
        }
        int ans = 0;
        int mul = 1;
        for(int i=ll.size()-1; i>=0; i--) {
            ans += (ll.get(i))*(mul);
            mul*=10;
        }
        return ans;
        
    }
}