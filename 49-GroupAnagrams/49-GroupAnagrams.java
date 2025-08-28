// Last updated: 28/08/2025, 11:20:43
class Solution {
    public static String GetKey(String s) {
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++) {
            sb.append(freq[i]+" ");
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            String key = GetKey(strs[i]);
            System.out.println(key);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s: map.keySet()) {
            ans.add(map.get(s));
        }
        return ans;
    }
}