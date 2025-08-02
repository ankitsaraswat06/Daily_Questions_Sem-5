// Last updated: 02/08/2025, 18:59:54
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); 

        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                if(nums[i] + nums[j] + nums[k] > 0) {
                    k--;       
                } else if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k) {
                        j++;
                    }
                }

            }
        }

        return ans;  
        
    }
}