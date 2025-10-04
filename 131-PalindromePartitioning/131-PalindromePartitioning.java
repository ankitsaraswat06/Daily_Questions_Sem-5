// Last updated: 04/10/2025, 11:28:03
class Solution {
    public static boolean isPalindrome (String s) {
        int si = 0;
        int ei = s.length()-1;
        while(si<ei) {
            if(s.charAt(si) != s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public void partition(String ques, List<String> ll, List<List<String>> ans) {
        if(ques.length() == 0) {
            ans.add(new ArrayList<>(ll));
        }
        for(int cut = 1; cut<=ques.length(); cut++) {
            String s = ques.substring(0, cut);
            if(isPalindrome(s)) {
                ll.add(s);
                partition(ques.substring(cut), ll, ans);
                ll.remove(ll.size()-1);
            }
        }

    }
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partition(s, ll, ans);
        return ans;
    }
}