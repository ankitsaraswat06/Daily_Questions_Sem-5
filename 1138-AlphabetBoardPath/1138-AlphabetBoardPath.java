// Last updated: 22/12/2025, 11:16:42
1class Solution {
2    public String alphabetBoardPath(String target) {
3        int idx = 0;
4        Map<Character, int[]> map = new HashMap<>();
5        for(char i='a'; i<='z'; i++) {
6            int[] pos = new int[2];
7            pos[0] = idx/5;
8            pos[1] = idx%5;
9            map.put(i, pos);
10            idx++;
11        }
12        StringBuilder moves = new StringBuilder();
13        int i=0, j=0;
14        for(int k=0; k<target.length(); k++) {
15            char letter = target.charAt(k);
16            int nextI = map.get(letter)[0];
17            int nextJ = map.get(letter)[1];
18            if(i==map.get('z')[0] && j==map.get('z')[1] && letter!='z') {
19                moves.append("U");
20                i--;
21            }
22            while(j!=nextJ) {
23                if(j<nextJ) {
24                    moves.append("R");
25                    j++;
26                } else {
27                    moves.append("L");
28                    j--;
29                }
30            }
31            while(i!=nextI) {
32                if(i<nextI) {
33                    moves.append("D");
34                    i++;
35                } else {
36                    moves.append("U");
37                    i--;
38                }
39            }
40            moves.append("!");
41        }
42        return moves.toString();
43    }
44}