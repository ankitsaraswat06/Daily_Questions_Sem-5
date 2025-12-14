// Last updated: 14/12/2025, 14:48:22
1class Solution {
2    public String reverse(String s) {
3        StringBuilder rev = new StringBuilder();
4        for(int i=s.length()-1; i>=0; i--) rev.append(s.charAt(i));
5        return rev.toString();
6    }
7    public int countVowel(String s) {
8        int c=0;
9        for(int i=0; i<s.length(); i++) {
10            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') c++;
11        }
12        return c;
13    }
14    public String reverseWords(String s) {
15        
16        String[] arr = s.split(" ");
17        int match = countVowel(arr[0]);
18
19        for(int i=1; i<arr.length; i++) {
20            if(match==countVowel(arr[i])) {
21                arr[i] = reverse(arr[i]);
22            }
23        }
24        StringBuilder sb = new StringBuilder();
25        for(int i=0; i<arr.length; i++) {
26            sb.append(arr[i]+" ");
27        }
28        return sb.toString().trim();
29    }
30}