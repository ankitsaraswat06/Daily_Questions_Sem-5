// Last updated: 02/08/2025, 19:00:00
class Solution {
    public int reverse(int x) {
        int  y=Math.abs(x);
        long n=0;
        while(y>0){
            int rem=y%10;
            n=n*10+rem;
            
            y/=10;
        }
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE){
            return 0;
        }
        
        if(x<0){
            return (int)-n;
        }
        return (int)n;
    }
}