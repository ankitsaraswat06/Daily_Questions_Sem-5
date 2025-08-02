// Last updated: 02/08/2025, 18:53:53
class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        //StringBuilder merge2 = new StringBuilder();
        int i=0, j=0;
        while(i<word1.length() && j<word2.length()) {
            if(word1.substring(i).compareTo(word2.substring(j))>0) {
                merge.append(word1.charAt(i));
                i++;
            } else {
                merge.append(word2.charAt(j));
                j++;
            }
        }
        merge.append(word1.substring(i));
        merge.append(word2.substring(j));
        return merge.toString();
    }
}