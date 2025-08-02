// Last updated: 02/08/2025, 18:53:20
class Solution {
    public int numberOfBeams(String[] bank) {
        int arr[] = new int[bank.length];
        for(int i=0; i<bank.length; i++) {
            int countOne = 0;
            for(int j=0; j<bank[i].length(); j++) {
                if(bank[i].charAt(j)=='1') {
                    countOne++;
                }
            }

            arr[i] = countOne;
        }
        int total = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[j]!=0) {
                        total+=arr[i]*arr[j];
                        break;
                    }
                }
            }
        }

        return total;
        
        
    }
}