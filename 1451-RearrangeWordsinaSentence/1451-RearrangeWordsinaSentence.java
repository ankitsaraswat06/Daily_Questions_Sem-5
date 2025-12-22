// Last updated: 22/12/2025, 18:27:39
1class Solution {
2    public String arrangeWords(String text) {
3        String[] words = text.trim().split(" ");
4        Arrays.sort(words, (a,b)-> a.length()-b.length());
5        System.out.println(Arrays.toString(words));
6        StringBuilder sb = new StringBuilder();
7
8        char one = words[0].charAt(0);
9        sb.append(String.valueOf(one).toUpperCase());
10        if(words[0].length()==1) sb.append(" ");
11        else sb.append(words[0].substring(1)+" ");
12        for(int i=1; i<words.length; i++) {
13            sb.append(words[i].toLowerCase()+" ");
14        }
15        return sb.toString().trim();
16
17
18        
19    }
20}