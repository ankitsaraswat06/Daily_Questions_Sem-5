// Last updated: 02/08/2025, 18:52:53
class Solution {
    public int countDistinctIntegers(int[] nums) {
       Set<Integer> list = new HashSet<>();
        for (int num : nums) {
            list.add(num);
        }
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int num=nums[i];
            while(num>0){
                int r=num%10;
                sum=sum*10+r;
                num=num/10;
            }
            list.add(sum);
        }
        
      
        return list.size();
    }
}