// Last updated: 02/08/2025, 18:57:40
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        int n = nums.length;
        int c1 = 0, c2 = 0, v1 = 0, v2 = 0;
        for(int num: nums) {
            if(num==c1) v1++;
            else if(num==c2) v2++;
            else if(v1==0) {
                c1 = num;
                v1++;
            } else if(v2==0) {
                c2 = num;
                v2=1;
            } else {
                v1--;
                v2--; 
            }
        }
        v1 = v2 = 0;
        for(int num: nums) {
            if(num==c1) v1++;
            else if(num == c2) v2++;
        }
        if(v1>n/3) ll.add(c1);
        if(v2>n/3) ll.add(c2);
        return ll;
    }
}