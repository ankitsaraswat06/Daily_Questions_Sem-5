// Last updated: 02/08/2025, 18:53:55
class Solution {
    public int beauty(String s, int i, int j) {
        int[] freq = new int[26];
        for(int k=i; k<=j; k++) freq[s.charAt(k)-'a']++;
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        for(int k=0; k<26; k++) {
            if(freq[k] > maxFreq && freq[k]>0) maxFreq = freq[k];
            if(freq[k]< minFreq && freq[k]>0) minFreq = freq[k];
        }
        // System.out.println(maxFreq-minFreq);
        return maxFreq-minFreq;
    }
    public int beautySum(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                int b = beauty(s, i, j);
                if(b>0) sum+=b;
            }
        }  
        return sum;
    }
}