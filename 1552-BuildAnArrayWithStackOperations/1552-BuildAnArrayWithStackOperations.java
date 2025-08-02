// Last updated: 02/08/2025, 18:54:18
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int cnt = 1,i=0;
        List<String> ll = new ArrayList<>();
        while(i<target.length) {
            if(target[i]==cnt) {
                ll.add("Push");
                i++;
            } else {
                ll.add("Push");
                ll.add("Pop");
            }
            cnt++;
        }
        return ll;
    }
}