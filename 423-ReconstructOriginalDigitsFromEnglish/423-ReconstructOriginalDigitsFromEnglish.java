// Last updated: 02/08/2025, 18:56:48
class Solution {
    public String originalDigits(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int[] Digitcount=new int[10];

        //Count unique letters that only appear in a single number's spelling.
        Digitcount[0]=freq['z'-'a'];
        Digitcount[2]=freq['w'-'a'];
        Digitcount[4]=freq['u'-'a'];
        Digitcount[6]=freq['x'-'a'];
        Digitcount[8]=freq['g'-'a'];

        // For other numbers which share letters, we subtract the counts of 
        // already identified unique ones to get the correct digit counts.

        Digitcount[3]=freq['h'-'a']-Digitcount[8];
        Digitcount[5]=freq['f'-'a']-Digitcount[4];
        Digitcount[7]=freq['s'-'a']-Digitcount[6];

        // For one and nine, we deduce their counts by subtracting the counts of         digits
        // that share the same letters and have been previously determined.

        Digitcount[1]=freq['o'-'a']-Digitcount[0]-Digitcount[2]-Digitcount[4];
        Digitcount[9]=freq['i'-'a']-Digitcount[5]-Digitcount[6]-Digitcount[8];

        StringBuilder result = new StringBuilder();
        for (int i=0;i<10;i++) {
            for (int j=0; j<Digitcount[i];j++) {
                result.append(i);
            }
        }
        return result.toString();
        

    }
}