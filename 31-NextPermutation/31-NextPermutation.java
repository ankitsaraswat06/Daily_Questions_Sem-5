// Last updated: 02/08/2025, 18:59:37
class Solution {
    public void reverse(int[] arr, int i, int j) {
        while(i<j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int p = -1;
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                p = i;
                break;
            }
        }
        if(p==-1) {
            reverse(arr, 0, n-1);
            return;
        }
        int q = -1;
        for(int i=n-1; i>p; i--) {
            if(arr[i] > arr[p]) {
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        reverse(arr, p+1, n-1);
        
    }
}