// Last updated: 23/09/2025, 21:23:33
class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2 [] = version2.split("\\.");
        int i=0, j=0;
        while(i<v1.length && j<v2.length) {
            int a = Integer.parseInt(v1[i]);
            int b = Integer.parseInt(v2[j]);
            if(a>b) return 1;
            if(b>a) return -1;
            i++;
            j++;
        }
        if(i==v1.length && j==v2.length) return 0;
        else if(i<v1.length) {
            while(i<v1.length) {
                int a = Integer.parseInt(v1[i]);
                int b = 0;
                if(a>b) return 1;
                if(b>a) return -1;
                i++;
            }
        } else {
            while(j<v2.length) {
                int a = 0;
                int b = Integer.parseInt(v2[j]);
                if(a>b) return 1;
                if(b>a) return -1;
                j++;
            }
        }
        return 0;
    }
}