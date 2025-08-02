// Last updated: 02/08/2025, 18:54:22
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words.length; j++) {
                if(words[j].contains(words[i]) && i!=j) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
        
    }
}