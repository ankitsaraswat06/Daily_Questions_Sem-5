// Last updated: 02/08/2025, 18:56:39
class Solution {
    public int compress(char[] chars) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        ans.append(chars[0]);
        for(int i=1; i<chars.length; i++) {
            if(chars[i-1] == chars[i]) {
                count++;
            } else {
                if(count>1) ans.append(count);
                ans.append(chars[i]);
                count = 1;
            }
        }
        if(count>1) ans.append(count);
        System.out.print(ans);
        for(int i=0; i<ans.length(); i++) {
            chars[i] = ans.charAt(i);    
        }
        return ans.length();
    }
}