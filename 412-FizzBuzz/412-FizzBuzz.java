// Last updated: 02/08/2025, 18:56:51
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int c1 = 1;
        int c2 = 1;
        for(int i=1; i<=n; i++) {
            StringBuilder sb = new StringBuilder();
            if(c1==3) {
                sb.append("Fizz");
                c1 = 0;
            }
            if(c2==5) {
                sb.append("Buzz");
                c2 =0;
            }
            if(sb.toString().equals("")) sb.append(i);
            ans.add(sb.toString());
            c1++;
            c2++;
        } 
        return ans;
    }
}