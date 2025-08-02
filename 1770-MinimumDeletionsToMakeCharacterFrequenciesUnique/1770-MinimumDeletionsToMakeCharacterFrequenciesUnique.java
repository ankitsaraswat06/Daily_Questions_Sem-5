// Last updated: 02/08/2025, 18:54:04
class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int del = 0;
        for(int i=0; i<26; i++) {
            if(freq[i]>0) {
                while(set.contains(freq[i])) {
                    freq[i]--;
                    del++;
                }
                if(freq[i]>0) set.add(freq[i]);
            }
        }
        return del;

    }
}