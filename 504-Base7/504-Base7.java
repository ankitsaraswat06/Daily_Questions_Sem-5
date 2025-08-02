// Last updated: 02/08/2025, 18:56:24
class Solution {
    public String convertToBase7(int n) {
        if(n==0) return "0";
        List<Integer> lst = new ArrayList<>();
        int num = Math.abs(n); 
        while(num>0) {
            lst.add(num%7);
            num = num/7;
        }
        StringBuilder sb = new StringBuilder();
        if(n<0) sb.append("-");
        for(int i=lst.size()-1; i>=0; i--) sb.append(lst.get(i));
        return sb.toString();
    }
}