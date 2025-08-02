// Last updated: 02/08/2025, 18:53:05
class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for(int i=0; i<grid.length; i++) {
            List<Integer> ll = new ArrayList<>();
            for(int j=0; j<grid[0].length; j++) {
                ll.add(grid[i][j]);
            }
            map.put(ll, map.getOrDefault(ll,0) + 1);
        }  
        int count = 0;
        for(int i =0; i<grid[0].length; i++) {
            List<Integer> ll = new ArrayList<>();
            for(int j=0; j<grid.length; j++) {
                ll.add(grid[j][i]);
            }
            if(map.containsKey(ll)) count+=map.get(ll); 
        }   
        return count;  
    }
}