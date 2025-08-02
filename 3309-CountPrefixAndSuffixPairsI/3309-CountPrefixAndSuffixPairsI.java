// Last updated: 02/08/2025, 18:52:10
class Solution {
    public boolean isPrefixAndSuffix(String str1, String str2) {
        if (str2.indexOf(str1) == 0 && str2.lastIndexOf(str1) == str2.length()-str1.length()) {
            return true;
        }
        return false;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count =0;
        for(int i=0; i<words.length; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
        
    }
}