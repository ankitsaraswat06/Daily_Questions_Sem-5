// Last updated: 18/08/2025, 15:04:59
class Solution {
    public String largestGoodInteger(String num) {
        int count = 1;
        int i = 0;
        int ans = Integer.MIN_VALUE;
        for(int j=1; j<num.length(); j++) {
            if(num.charAt(j)==num.charAt(i)) {
                count++;
                if(count==3) {
                    String str = num.substring(i, j+1);
                    ans = Math.max(ans, Integer.parseInt(str));
                }
            } else {
                i=j;
                count = 1;
            }
        }
        if(ans==0) return "000";
        return ans == Integer.MIN_VALUE?"": String.valueOf(ans);
    }
}