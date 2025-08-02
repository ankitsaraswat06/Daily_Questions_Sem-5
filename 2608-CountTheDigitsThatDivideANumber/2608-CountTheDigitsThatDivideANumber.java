// Last updated: 02/08/2025, 18:52:43
class Solution {
    public int countDigits(int num) {
        int p = num;
        int count = 0;
        while(num>0) {
            int rem = num%10;
            if(p%rem == 0) {
                count++;
            }
            num=num/10;
        }

        return count;
        
    }
}