// Last updated: 01/10/2025, 21:25:12
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] freq = new int[3];
        for(int i=0; i<bills.length; i++) {
            if(bills[i]==5) freq[0]++;
            if(bills[i]==10) {
                if(freq[0]==0) return false;
                freq[0]--;
                freq[1]++;
            }
            if(bills[i]==20) {
                if(freq[1]>=1 && freq[0]>=1) {
                    freq[1]--;
                    freq[0]--;
                    freq[2]++;
                } else if(freq[0]>=3) {
                    freq[0]-=3;
                    freq[2]++;
                } else {
                    return false;
                }
            }
        }  
        return true;
    }
}