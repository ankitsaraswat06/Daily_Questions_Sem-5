// Last updated: 02/08/2025, 18:54:15
class Solution {
    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        arr[0] = arr[0].toLowerCase();
        for(int i=0; i<arr.length-1; i++) {
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j].length() > arr[j+1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        String firstWord = arr[0].substring(0,1).toUpperCase() + arr[0].substring(1);
        sb.append(firstWord);
        sb.append(" ");
        for(int i=1; i<arr.length-1; i++) {
            sb.append(arr[i] + " ");
        }
        sb.append(arr[arr.length-1]);

        return sb.toString();
        
    }
}