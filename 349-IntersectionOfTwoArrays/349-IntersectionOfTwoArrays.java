// Last updated: 02/08/2025, 18:57:08
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans=new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]>nums2[j]){
                j++;

            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                if(k==0){
                    ans[k++]=nums1[i];
                }
                if(ans.length>1 && nums1[i]!=ans[k-1]){
                    ans[k++]=nums1[i];
                }
                
                
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}
