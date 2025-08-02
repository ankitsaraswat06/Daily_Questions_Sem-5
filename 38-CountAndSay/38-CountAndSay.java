// Last updated: 02/08/2025, 18:59:28
class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String prev = countAndSay(n-1);
        StringBuilder rle = new StringBuilder();
        int count = 1;
        for(int i=1; i<prev.length(); i++) {
            if(prev.charAt(i-1) == prev.charAt(i)) count++;
            else {
                rle.append(count);
                rle.append(prev.charAt(i-1));
                count = 1;
            }
        }
        rle.append(count);
        rle.append(prev.charAt(prev.length()-1));
        return rle.toString();  
    }
}