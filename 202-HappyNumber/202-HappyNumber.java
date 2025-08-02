// Last updated: 02/08/2025, 18:57:53
class Solution {
    public boolean isHappy(int n) {
       Set<Integer> set = new HashSet<>();
       while(n>1) {
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        if(set.contains(sum)) return false;
        set.add(sum);
        if(sum==1) return true;
        n = sum;
       }
       return true; 
    }
}