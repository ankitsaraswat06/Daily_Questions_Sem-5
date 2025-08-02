// Last updated: 02/08/2025, 18:54:09
class Solution {
    public int minFlips(String target) {
        int c=0;
        if(target.charAt(0)=='0'){
            c--;
        }
        if(!target.contains("1")){
            return 0;
        }
        
        for(int i=0;i<target.length()-1;i++){
            if(target.charAt(i)!=target.charAt(i+1)){
                c++;
            }
        }
        return c+1;
       
        
    }
}