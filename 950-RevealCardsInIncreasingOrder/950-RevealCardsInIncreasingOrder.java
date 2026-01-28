// Last updated: 28/01/2026, 12:54:26
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int[] ans = new int[deck.length];
5        Queue<Integer> q = new ArrayDeque<>();
6        for(int i=0; i<deck.length; i++) q.offer(i);
7        int idx = 0;
8        while(!q.isEmpty()) {
9            int r = q.poll();
10            ans[r] = deck[idx++];
11            if(!q.isEmpty()) q.offer(q.poll());
12        }
13        return ans;
14
15        
16    }
17}