// Last updated: 02/08/2025, 18:54:33
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] intArr = new Integer[arr.length];
        for(int i=0; i<arr.length; i++) {
            intArr[i] = arr[i];
        }
        Arrays.sort(intArr, (a,b) -> {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);
            return bitCountA == bitCountB ? Integer.compare(a,b) : Integer.compare(bitCountA, bitCountB);
        });
        for(int i=0; i<arr.length; i++) {
            arr[i] = intArr[i];
        }
        return arr;
    }
}