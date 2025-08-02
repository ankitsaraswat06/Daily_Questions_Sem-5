// Last updated: 02/08/2025, 18:59:05
class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] arr = s.split("\s+");
        
        return arr[arr.length-1].length();
    }
}