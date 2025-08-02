// Last updated: 02/08/2025, 18:57:13
class Solution {
    public boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        List<Character> ll = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(isVowel(s.charAt(i))) ll.add(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(!isVowel(s.charAt(i))) ans.append(s.charAt(i));
            else ans.append(ll.remove(ll.size()-1));
        }
        return ans.toString();
        
    }
}