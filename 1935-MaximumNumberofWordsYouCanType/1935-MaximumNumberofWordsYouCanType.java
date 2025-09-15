// Last updated: 15/09/2025, 10:14:08
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> st = new HashSet<>();
        for(int i=0; i<brokenLetters.length(); i++) st.add(brokenLetters.charAt(i));
        int count = 0;
        String[] arr = text.split(" ");
        for(int i=0; i<arr.length; i++) {
            int f=0;
            for(int j=0; j<arr[i].length(); j++) {
                if(st.contains(arr[i].charAt(j))) f=1;
            }
            if(f==0) count++;
        }
        return count;
        
    }
}