// Last updated: 02/08/2025, 18:59:52
class Solution {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void print(String ques, String ans, ArrayList<String> list) {
        if(ques.length() == 0) {
            // System.out.println(ans);
            list.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        String getString =key[ch-'0'];
        for(int i=0; i<getString.length(); i++) {
            print(ques.substring(1), ans+getString.charAt(i), list);
        }

    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        
        ArrayList<String> list = new ArrayList<>();
        print(digits, "", list);
        return list;
        
    }
}