// Last updated: 02/08/2025, 18:56:20
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
       Collections.sort(dictionary, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());
            } else {
                return a.compareTo(b);
            }
        });
        for(int i=0; i<dictionary.size(); i++) {
            int sPoint = 0;
            int dPoint = 0;
            while(sPoint<s.length()){
                if(s.charAt(sPoint) ==  dictionary.get(i).charAt(dPoint)) {
                    dPoint++;
                }
                if(dPoint == dictionary.get(i).length()) {
                    return dictionary.get(i);
                }
                sPoint++;
            }
        }
        return "";
            
    }
}