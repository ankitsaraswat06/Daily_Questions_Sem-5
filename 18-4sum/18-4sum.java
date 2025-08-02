// Last updated: 02/08/2025, 18:59:50
class Solution {
    public List<List<Integer>> fourSum(int[] nums, long target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++) {
            if(i>0 && nums[i-1] == nums[i]) {
                continue;
            }
            for(int j= i+1; j<nums.length-2; j++) {
                if(j>i+1 && nums[j-1] == nums[j]) {
                    continue;
                }

                int k = j+1;
                int l = nums.length-1;

                while(k<l) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                    if(sum==target) {
                        ans.add(Arrays.asList(nums[i],nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) {
                            k++;
                        }
                        while(k<l && nums[l] == nums[l+1]) {
                            l--;
                        }
                    } else if(sum< target) {
                        k++;
                    } else {
                        l--;
                    }
                }                
            }

        }

        return ans;

        
    }
}