// Last updated: 02/08/2025, 15:28:24
class Solution {
    public int maxDifference(String s) {
        int [] freq = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int i=0; i<26; i++) {
            if(freq[i]%2==0 && freq[i]!=0) {
                minEven = Math.min(freq[i], minEven);
            } else {
                maxOdd = Math.max(freq[i], maxOdd);
            }
        }
        // System.out.print(minEven +" " + maxOdd);
        return maxOdd-minEven;
        
    }
}