// Last updated: 02/08/2025, 18:58:28
class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        StringBuilder check = new StringBuilder();
        for(int i=0; i<lower.length(); i++) {
            if((lower.charAt(i)>='a' && lower.charAt(i) <= 'z') || (lower.charAt(i)>='0' && lower.charAt(i)<='9') ){
                check.append(lower.charAt(i));
            } 
        }
        int si = 0;
        int ei = check.length()-1;
        while(si<ei){
            if(check.charAt(si)!=check.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }

        return true;
        
    }
}