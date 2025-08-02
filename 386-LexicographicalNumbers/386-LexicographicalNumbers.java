// Last updated: 02/08/2025, 18:57:00
class Solution {
    public void Lexico(int n, int curr, List<Integer> list) {
        if(curr > n) {
            return;
        }
        if(curr>0)list.add(curr);
        int i=0;
        if(curr == 0) {
            i = 1;
        } 
        for(;i<=9; i++) {
            Lexico(n, curr*10 + i, list);
        }

    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        Lexico(n, 0, list);
        return list;
    }
}