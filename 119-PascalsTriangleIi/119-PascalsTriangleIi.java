// Last updated: 02/08/2025, 18:58:33
class Solution {
    // public static int fact(int n) {
    //     int factorial =1;
    //     if(n==0) {
    //         return 1;
    //     }
    //     for(int i=1; i<=n; i++) {
    //         factorial*=i;
    //     }

    //     return factorial;
    // }
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<>();
        long value = 1;
        ans.add(1);
        for(int i=1; i<=rowIndex; i++) {
            value = value*(rowIndex-i+1)/i;
            ans.add((int)value);
        }

        return ans;
    }
}