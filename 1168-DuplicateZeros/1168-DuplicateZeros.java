// Last updated: 02/08/2025, 18:54:56
class Solution {
    public void duplicateZeros(int[] arr) {
        int idx = 0;
        int dup[] = new int[arr.length];
        int i =0;
        while(i<arr.length && idx<arr.length) {
            if(arr[i] ==0) {
                dup[idx++] = 0;
                if(idx==arr.length) break;
                dup[idx++] = 0;
            } else {
                dup[idx++] = arr[i];
            }
            i++;
        }
        for(int k=0; k<arr.length; k++) {
            arr[k] = dup[k];
        }
    }
}