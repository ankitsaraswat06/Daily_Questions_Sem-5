// Last updated: 02/08/2025, 18:54:24
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        // System.out.print(list);
        int target[]=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            target[i]=list.get(i);
        }
        return target;
    }
}