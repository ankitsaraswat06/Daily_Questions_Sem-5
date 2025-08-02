// Last updated: 02/08/2025, 18:52:31
class Solution {
    public boolean empty(int[] freq) {
        for(int i=0; i<freq.length; i++) {
            if(freq[i]!=0) return false;
        }
        return true;
    }
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> matrix = new ArrayList<>();
        int[] freq = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
            freq[nums[i]]++;
        }  
        while(true) {
            List<Integer> ll = new ArrayList<>();
            for(int i=0; i<freq.length; i++) {
                if(freq[i]!=0) {
                    ll.add(i);
                    freq[i]--;
                }
            }
            matrix.add(ll);
            if(empty(freq)) break;
        }
        return matrix;
    }
}