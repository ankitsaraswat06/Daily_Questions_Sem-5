// Last updated: 02/08/2025, 18:56:02
class Solution {
    public int repeatedStringMatch(String a, String b) {
        int c = 0;
        StringBuilder n = new StringBuilder();
        while(n.length() < b.length()) {
            n.append(a);
            c++;
        }
        if(n.toString().contains(b)) return c;
        n.append(a);
        c++;
        if(n.toString().contains(b)) return c;
        return -1;
    }
}