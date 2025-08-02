// Last updated: 02/08/2025, 18:54:51
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDis = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++) {
            if(Math.abs(arr[i-1]-arr[i]) < minDis) minDis = Math.abs(arr[i-1]-arr[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<arr.length; i++) {
            if(Math.abs(arr[i-1]-arr[i]) == minDis) {
                List<Integer> ll = new ArrayList<>();
                ll.add(arr[i-1]);
                ll.add(arr[i]);
                ans.add(ll);
            }
        }
        return ans;
    }
}