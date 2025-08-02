// Last updated: 02/08/2025, 15:28:12
class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }

        
        StringBuilder firstHalf = new StringBuilder();
        String m = "";
        
        for(char ch = 'a'; ch<='z'; ch++){
            int count = freq[ch-'a'];
            if(count%2!=0) m = m+ch;
            for(int i=0; i<count/2; i++) {
                firstHalf.append(ch);
                
            }   
        }
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();
        return firstHalf.toString() + m + secondHalf;
    }
}