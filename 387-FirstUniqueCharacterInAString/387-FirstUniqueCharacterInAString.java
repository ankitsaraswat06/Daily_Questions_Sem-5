// Last updated: 02/08/2025, 18:56:59
class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            arr[(int)(s.charAt(i)) - 97]++;
        }

        char c = 'a';

        for(int i=0; i<s.length(); i++) {
            if(arr[(int)(s.charAt(i)) - 97] == 1) {
                return i;
            }

        }

        return -1;
    
    }

        
}