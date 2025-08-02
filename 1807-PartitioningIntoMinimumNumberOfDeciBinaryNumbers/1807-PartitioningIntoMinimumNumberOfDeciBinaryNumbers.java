// Last updated: 02/08/2025, 18:54:01
class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i=0; i<n.length(); i++) {
            max = Math.max(n.charAt(i)-'0', max);
        }
        return max;
        
    }
}