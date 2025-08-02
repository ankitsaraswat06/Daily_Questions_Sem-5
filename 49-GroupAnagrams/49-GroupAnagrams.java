// Last updated: 02/08/2025, 18:59:15
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String arry[] = new String[strs.length];
        List<List<String>> ans = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            arry[i] = new String(arr);
        }
        boolean isVisited[] = new boolean[strs.length];
        for(int i=0; i<arry.length; i++) {
            if(!isVisited[i]) {
                List<String> inner = new ArrayList<>();
                inner.add(strs[i]); 
                isVisited[i] = true;
                for(int j=i+1; j<arry.length; j++) {
                    if(arry[i].equals(arry[j]) && !isVisited[j]) {
                        inner.add(strs[j]);
                        isVisited[j] = true;
                    }
                }
                ans.add(inner);
            }

        }
        return ans;
        
    }
}