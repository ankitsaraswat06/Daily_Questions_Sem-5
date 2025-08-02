// Last updated: 02/08/2025, 18:59:45
class Solution {
    public void Print(int n, int closed, int opened, String ans, ArrayList<String> list) {
        if(opened == n && closed == n) {
            list.add(ans);
            System.out.println(ans);
            return;
        }
        if(opened>n || closed> opened) {
            return;
        }

        Print(n, closed, opened+1 , ans+"(", list);
        Print(n, closed+1, opened,  ans+ ")", list);

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        Print(n, 0, 0, "", list);
        return list;
    }
}