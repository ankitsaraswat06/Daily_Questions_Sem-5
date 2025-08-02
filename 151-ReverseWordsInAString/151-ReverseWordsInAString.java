// Last updated: 02/08/2025, 18:58:15
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] arr = s.split("\s+"); //splits on the basis of regex

        String ans ="";
        for(int i=arr.length-1; i>=0; i--) {
            ans= ans + arr[i] + " ";
        }

        return ans.trim();


    }
}