// Last updated: 02/08/2025, 18:54:53
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        HashMap<Integer,Integer> map =new HashMap<>();
        int rank=1;
        for(int i=0;i<list.size();i++){
            if (!map.containsKey(list.get(i))) {
                 map.put(list.get(i), rank);
                rank++;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}