// Last updated: 02/08/2025, 18:53:39
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            sb.append(s.charAt(i)-'a' + 1);
        }
        int ans = 0;
        while(k-->0) {
            int sum = 0;
            for(int i=0; i<sb.length(); i++) {
                sum+=(sb.charAt(i)-'0');
            }
            ans = sum;
            sb = new StringBuilder("");
            while(sum>0) {
                sb.append(sum%10);
                sum/=10;  
            }
        }
        return ans;
    }
}