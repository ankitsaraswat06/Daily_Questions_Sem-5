// Last updated: 02/08/2025, 18:57:43
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
            {
                if(Math.abs(m.get(nums[i])-i)<=k)return true;
               
            }
             m.put(nums[i],i);
        }
        return false;
    }
}