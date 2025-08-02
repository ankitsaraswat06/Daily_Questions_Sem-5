// Last updated: 02/08/2025, 18:59:19
class Solution {
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr, int idx, Set<List<Integer>> ans) {
        if(idx==arr.length) {
            ArrayList<Integer> ll = new ArrayList<>();
            for(int i=0; i<arr.length; i++) {
                ll.add(arr[i]);
            }
            ans.add(ll);
            return;
        }
        for(int i= idx; i<arr.length; i++) {
            swap (i, idx, arr);
            print(arr, idx+1, ans);
            swap(i, idx, arr);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Set<List<Integer>> ans = new HashSet<>();
        
        print(nums,0, ans); 
        List<List<Integer>> lst = new ArrayList<>();
        for(List<Integer> t: ans) {
            lst.add(t);
        }
        return lst;
    }
}